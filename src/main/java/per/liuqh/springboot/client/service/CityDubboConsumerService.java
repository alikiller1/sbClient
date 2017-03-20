/*package per.liuqh.springboot.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;

import per.liuqh.dubbo.entity.City;
import per.liuqh.service.dubbo.CityDubboService;
import per.liuqh.springboot.client.dao.UserDao;
import per.liuqh.springboot.client.entity.User;

@Service
public class CityDubboConsumerService {

	@Reference(version = "1.0.0")
	CityDubboService cityDubboService;
	@Autowired
	private UserDao userDao;

	public void printCity() {
		String cityName = "温岭";
		City city = cityDubboService.findCityByName(cityName);
		System.out.println(city.toString());
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void test2() {
		User u = new User();
		u.setName("ccc");
		userDao.save(u);
		try {
			String cityName = "温岭";
			City city = cityDubboService.findCityByName(cityName);
			//test3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*//**
	 * 同一个类，一个方法调另一个加了事物，并且需要回滚数据的方法，try-catch后数据不会回滚，
	 * 但是调另一个类加了事物，并且需要回滚数据的方法，会回滚
	 * @throws Exception
	 *//*
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void test3() throws Exception{
		if(1<2){
			throw new Exception("ddd");
		}
	}
}
*/