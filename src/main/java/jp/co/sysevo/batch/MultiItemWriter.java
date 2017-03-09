package jp.co.sysevo.batch;

import jp.co.sysevo.model.OutptData;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("multiItemWriter")
@Scope("step")
public class MultiItemWriter implements ItemWriter<OutptData>, ApplicationContextAware {

	private List<ItemWriter<? super OutptData>> delegates;
	private ApplicationContext ctx = null;

	public void setDelegates(List<ItemWriter<? super OutptData>> delegates) {
		this.delegates = delegates;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void write(List<? extends OutptData> items) throws Exception {

		ItemWriter<OutptData> globalWriter = (ItemWriter<OutptData>) delegates.get(0);
		ItemWriter<OutptData> japanWriter = (ItemWriter<OutptData>) delegates.get(1);

		// グローバル共有ファイル出力
		globalWriter.write(items);
		// 日本独自ファイル出力
		japanWriter.write(items);
		
		ItemWriter<OutptData> updateWriter = (ItemWriter<OutptData>)ctx.getBean("updateWriter");
		// DB更新
		updateWriter.write(items);
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}
}