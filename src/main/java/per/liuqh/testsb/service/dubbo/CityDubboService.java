package per.liuqh.testsb.service.dubbo;

import per.liuqh.testsb.entity.City;


public interface CityDubboService {
	 public City findCityByName(String cityName);
}
