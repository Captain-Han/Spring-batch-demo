package jp.co.sysevo.batch;

import java.io.File;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FtpTasklet implements Tasklet {
	final Logger logger = LoggerFactory.getLogger(OutptDataProcessor.class);
	private String fileName;
	private MessageChannel ftpChannel;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		File file = new File(fileName);
		
		if (file.exists()) {
			Message<File> message = MessageBuilder.withPayload(file).build();
			try {
				logger.info("File : {} is sending to Ftp.", fileName);
				ftpChannel.send(message);
				logger.info("File : {} has sended to Ftp.", fileName);
			} catch (Exception e) {
				
				logger.error("Could not send file:{} to Ftp.", fileName);
			}
		} else {
			logger.warn("File : {} does not exist.", fileName);
		}

	return RepeatStatus.FINISHED;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public MessageChannel getFtpChannel() {
		return ftpChannel;
	}

	public void setFtpChannel(MessageChannel ftpChannel) {
		this.ftpChannel = ftpChannel;
	}
}