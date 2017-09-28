package com.awe.aiweier.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class ViewController {

    @RequestMapping(value="abc",method = RequestMethod.GET)
    public String all(){
        System.out.println("asfdsf");
        return "contact.html";
    }
}
