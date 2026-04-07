package com.luckermt.hello.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luckermt.hello.Service.HelloService;


@RestController
@RequestMapping("/api")
public class HelloController {
    
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String hola() {
        return HelloService.getHello();
    }
    

}
