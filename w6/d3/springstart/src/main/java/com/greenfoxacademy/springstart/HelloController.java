package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public @ResponseBody String handleHello() {
        return "Hello!";
    }
}