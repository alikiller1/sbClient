package per.liuqh.springboot.client.service;

import org.springframework.stereotype.Service;

import per.liuqh.testsb.entity.City;
import per.liuqh.testsb.service.dubbo.CityDubboService;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class CityDubboConsumerService {
 
    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;
 
    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
