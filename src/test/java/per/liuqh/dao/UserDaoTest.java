package per.liuqh.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import per.liuqh.common.TestCase;
import per.liuqh.springboot.client.dao.UserDao;
import per.liuqh.springboot.client.entity.User;

public class UserDaoTest  extends TestCase{
	@Autowired
	private UserDao userDao;
	
	@Test
	public void test1(){
		User u= userDao.findOne(1);
		System.out.println("----->"+u);
	}

}
