package com.player.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestingController {
    @Value("${admin.name}")
    public String name;
    @RequestMapping("/name")
    public   String getName(){
        return "I am "+ name;
    }
    @GetMapping("/age")
    public String getAge(){
        return " 21 " ;
    }
    @GetMapping("/adress")
    public String getAdress(){
        return " Bizerte" ;
    }
    @GetMapping("/phone")
    public String getPhone(){
        return " 2698410" ;
    }



}
