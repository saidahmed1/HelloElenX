package com.basichelloworld.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @RequestMapping("/")
    public String index(){
        return "HelloWORLD!";
    }


}
