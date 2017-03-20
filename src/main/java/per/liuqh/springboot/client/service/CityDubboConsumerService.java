package per.liuqh.springboot.client.service;

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
		try {
			String cityName = "温岭";
			City city = cityDubboService.findCityByName(cityName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		User u = new User();
		u.setName("ccc");
		userDao.save(u);

	}
}
