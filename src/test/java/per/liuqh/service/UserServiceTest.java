package per.liuqh.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import per.liuqh.common.TestCase;
import per.liuqh.springboot.client.service.UserService;

public class UserServiceTest extends TestCase {
	@Autowired
	private UserService userService;
	
	@Test
	public void test1() throws Exception{
		userService.f();
	}

}
