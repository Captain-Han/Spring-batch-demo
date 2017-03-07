package jp.co.sysevo.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.sysevo.model.OutptData;

@Component("outptDataMapper")
public interface OutptDataMapper{

	public void updateTable(List<? extends OutptData> list);
}