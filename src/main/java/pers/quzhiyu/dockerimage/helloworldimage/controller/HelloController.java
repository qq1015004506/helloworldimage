package pers.quzhiyu.dockerimage.helloworldimage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.quzhiyu.dockerimage.helloworldimage.annotation.Monitor;

@RestController
public class HelloController {
    @Monitor
    @RequestMapping("/docker")
    public String hello(){
        return "hello!";
    }

    @RequestMapping("/hello")
    public String hello1(){
        return "hello!";
    }
}
