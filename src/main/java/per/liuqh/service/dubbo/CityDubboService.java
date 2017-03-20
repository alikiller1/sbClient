package per.liuqh.service.dubbo;

import per.liuqh.dubbo.entity.City;


public interface CityDubboService {
	 public City findCityByName(String cityName);
}
