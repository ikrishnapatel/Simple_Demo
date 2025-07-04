package com.simjenkins.demoproject.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FrontController {


    @GetMapping("/getHome")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String getUser()
    {
        return "Got response";
    }


    
}
