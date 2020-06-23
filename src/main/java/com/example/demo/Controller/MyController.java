package com.example.demo.Controller;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.user;
import com.example.demo.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MyController {

    @Autowired
    private IuserService userService;

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

    @GetMapping("/showuser")
    public List<user> findCities() {

        List<user> users = (List<user>) userService.findAll();

       // model.addAttribute("cities", user);

        return users;
    }



}
