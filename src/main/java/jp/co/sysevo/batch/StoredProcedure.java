package jp.co.sysevo.batch;

import javax.sql.DataSource;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoredProcedure implements Tasklet {
	final Logger logger = LoggerFactory.getLogger(OutptDataProcessor.class);
	
	private DataSource dataSource;
	private String sql;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		JdbcTemplate jdbc = new JdbcTemplate(getDataSource());
		// update 
		jdbc.execute(getSql());
		
		return RepeatStatus.FINISHED;
	}

}