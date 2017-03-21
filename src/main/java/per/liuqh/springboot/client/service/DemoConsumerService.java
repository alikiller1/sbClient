package per.liuqh.springboot.client.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import per.liuqh.serviceapi.service.DemoService;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class DemoConsumerService {
	@Reference
	DemoService demoService;
	
	@Transactional( propagation = Propagation.REQUIRED)
	public void test1() throws Exception{
		demoService.doTest();
	}
}
