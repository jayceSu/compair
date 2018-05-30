package com.adeng.compair.scheduled;

//import org.apache.log4j.Logger;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduled {
//	private static Logger log = Logger.getLogger(GenerateRoadListScheduled.class);
	
//	@Scheduled(cron = "0/5 * * * * ? ") // 间隔5秒执行
	public void run() {
		System.out.println("########################################## 进入任务调度了 ########################################## ");
		System.out.println(1221122112);
		System.out.println("########################################## 完成任务调度 ########################################## ");
	}
}
