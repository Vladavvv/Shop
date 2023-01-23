package com.example.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.processing.Generated;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("theDate", System.currentTimeMillis());
        return "hello-world";
    }


}
