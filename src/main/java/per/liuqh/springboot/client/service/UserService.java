package per.liuqh.springboot.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import per.liuqh.springboot.client.dao.UserDao;
import per.liuqh.springboot.client.entity.User;

@Service
public class UserService {
	@Autowired
	private DemoConsumerService demoConsumerService;
	@Autowired
	private UserDao userDao;

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void f() throws Exception {
		try {
			User u=new User();
			u.setName("dddddd");
			userDao.save(u);
			demoConsumerService.test1();
		} catch (Exception e) {
			System.out.println("-----------------");
			e.printStackTrace();
		}

	}
}
