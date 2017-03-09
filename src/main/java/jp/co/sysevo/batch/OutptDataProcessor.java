package jp.co.sysevo.batch;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jp.co.sysevo.model.InptData;
import jp.co.sysevo.model.OutptData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("itemProcessor")
@Scope("step")
public class OutptDataProcessor implements ItemProcessor<InptData, OutptData>{
	final Logger logger = LoggerFactory.getLogger(OutptDataProcessor.class);
	
	@Override
	public OutptData process(InptData item) throws Exception {
		logger.info("Exec itemProcessor class.");
		logger.debug(item.toString());
		OutptData result = new OutptData();
		result.setId(item.getId());
		result.setName(item.getName());
		result.setSendFlg(true);
		if (Integer.parseInt(item.getId()) % 2 == 0) {
			result.setSendFlg(false);
			logger.debug("InptData.id is {}, senf_flg is {}", item.getId(), result.getSendFlg());
		}
		result.setDes("Global");
		result.setDesJp("Japan");
		result.setUpdTs(getUpdTs());
		
		logger.debug(result.toString());
		return result;
	}

	private Date getUpdTs() {

		Calendar updTs = Calendar.getInstance(TimeZone.getDefault());
		return updTs.getTime();
	}

}
