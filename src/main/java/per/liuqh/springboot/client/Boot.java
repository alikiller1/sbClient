package per.liuqh.springboot.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import per.liuqh.springboot.client.service.CityDubboConsumerService;


@SpringBootApplication
public class Boot {
	Logger log=LoggerFactory.getLogger(Boot.class);
	
	
	public static void main(String[] args) {
		 // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(Boot.class, args);
       CityDubboConsumerService cityService = run.getBean(CityDubboConsumerService.class);
        cityService.printCity();
	}
}
