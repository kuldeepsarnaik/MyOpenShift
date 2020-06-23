package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userservice implements IuserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<user> findAll() {

        return (List<user>) repository.findAll();
    }

}
