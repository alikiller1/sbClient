package per.liuqh.springboot.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import per.liuqh.serviceapi.service.DemoService;
import per.liuqh.springboot.client.dao.UserDao;
import per.liuqh.springboot.client.entity.User;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class DemoConsumerService {
	@Reference
	DemoService demoService;
	@Autowired
	private UserDao userDao;

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void test1() throws Exception{
		User u=new User();
		u.setName("dddddd");
		userDao.save(u);
		try{
		//demoService.doTest();
		if(1<2){
			throw new RuntimeException();
		}
		}catch(Exception e){
			System.out.println("-------------------->ddsdafdaslfjdsa;lfjdsa;l");
			e.printStackTrace();
		}
	}
}
