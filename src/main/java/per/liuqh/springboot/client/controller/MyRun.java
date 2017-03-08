package per.liuqh.springboot.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import per.liuqh.springboot.client.autoconfiguration.HelloService;

@RestController
public class MyRun {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/auto/home")
    public String home(){
        return helloService.say();
    }
}