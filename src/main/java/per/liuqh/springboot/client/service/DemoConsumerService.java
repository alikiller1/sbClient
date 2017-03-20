package per.liuqh.springboot.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;

import per.liuqh.service.dubbo.DemoService;
import per.liuqh.springboot.client.dao.UserDao;
import per.liuqh.springboot.client.entity.User;

@Service
public class DemoConsumerService {
	@Reference
	DemoService demoService;
	@Autowired
	private UserDao userDao;

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void test1(){
		User u=new User();
		u.setName("ddd");
		userDao.save(u);
		try{
		demoService.doTest();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
