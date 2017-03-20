package per.liuqh.common;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import per.liuqh.springboot.client.Boot;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Boot.class)
//@Transactional
//@Rollback(false)
public class TestCase implements ApplicationContextAware{
	// 模拟request,response
	public MockHttpServletRequest request;
	public MockHttpServletResponse response;
	
	public ApplicationContext context;

	// 执行测试方法之前初始化模拟request,response
	@Before
	public void setUp() {
		request = new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");
		response = new MockHttpServletResponse();
	}

	@Override
	public void setApplicationContext(
			org.springframework.context.ApplicationContext applicationContext)
			throws BeansException {
		this.context=applicationContext;
		
	}
}
