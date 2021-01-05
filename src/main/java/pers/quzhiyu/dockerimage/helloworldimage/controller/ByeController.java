package pers.quzhiyu.dockerimage.helloworldimage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {
    @RequestMapping("/bye")
    public String hello(){
        return "bye!";
    }
}
