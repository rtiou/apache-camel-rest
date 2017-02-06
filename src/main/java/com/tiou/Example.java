package com.tiou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ronaldo on 06/02/2017.
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args){
        SpringApplication.run(Example.class, args);
    }
}
