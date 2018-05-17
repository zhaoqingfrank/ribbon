package com.zhaoqingfrank.ribbon.controller;


import com.zhaoqingfrank.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConsumeController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/ribbon-consumer",method= RequestMethod.GET)
    public String helloConsumer(){


        return helloService.helloservice();

    }



}
