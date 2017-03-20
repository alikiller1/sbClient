package per.liuqh.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import per.liuqh.common.TestCase;
import per.liuqh.springboot.client.service.CityDubboConsumerService;

public class CityDubboConsumerServiceTest extends TestCase {
	@Autowired
	private CityDubboConsumerService service;
	
	@Test
	public void test1(){
		service.test2();
	}

}
