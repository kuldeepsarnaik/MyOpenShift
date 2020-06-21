package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

    @RequestMapping("/")
    public String Start()
    {
        return  "something for now";

    }


    @RequestMapping("/Login")
 public String getName()
 {
     return  "something for now";

 }

}
