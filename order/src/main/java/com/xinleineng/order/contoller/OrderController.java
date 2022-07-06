package com.xinleineng.order.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("Order Added!");
        String msg = restTemplate.getForObject("http://localhost:8012/stock/reduct", String.class);
        msg= "Order Added Successfull! </br>"+msg;
        return  msg;
    }
}
