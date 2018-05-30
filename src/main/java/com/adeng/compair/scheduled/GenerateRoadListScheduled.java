package com.adeng.compair.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.adeng.compair.service.InvokeService;

/**
 * 任务调度：处理sqlserver与oracle中车次与订单的拆单以及生成路单
 * @author Administrator
 *
 */
@Component
public class GenerateRoadListScheduled {
	private static Logger log = Logger.getLogger(GenerateRoadListScheduled.class);
	
	@Resource(name = "invokeService")
	InvokeService service;

//	@Scheduled(cron = "0/5 * * * * ? ") // 间隔5秒执行
	public void invokeDealDataInteface() {
		log.info("########################################## 进入任务调度了 ########################################## ");
		Date beforeDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		log.info("########################################## 进入任务时间为：" + sdf.format(beforeDate) + " ##########################################");
		service.dealOrder();
		Date afterDate = new Date();
		log.info("########################################## 完成任务时间为：" + sdf.format(afterDate) + " ##########################################");
		log.info("########################################## 完成任务调度 ########################################## ");
	}
}
