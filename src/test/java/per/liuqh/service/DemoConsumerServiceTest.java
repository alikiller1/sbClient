package per.liuqh.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import per.liuqh.common.TestCase;
import per.liuqh.springboot.client.service.DemoConsumerService;

public class DemoConsumerServiceTest extends TestCase {
	
	@Autowired
	private DemoConsumerService demoConsumerService;
	
	@Test
	public void test1()throws Exception{
		demoConsumerService.test1();
	}
	
}
