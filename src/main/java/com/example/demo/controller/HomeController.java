package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping():q!
    :

    public String index()
    {
        System.out.println("=======================");
        System.out.println("=======================");
        return "index";
    }
}
