package com.d1.demo.controllers;

import com.d1.demo.models.Doubling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping (value = "/")
    public String singleEndpoint() {
        return "index";
    }

    @GetMapping (value = "/doubling")
    @ResponseBody // we return text only, not template
    public Doubling doubling(@RequestParam (value = "input", required = false) Integer input) { // not required param
        if (input != null) {
            return new Doubling(input);
        } else {
            return new Doubling();
        }
    }
}
