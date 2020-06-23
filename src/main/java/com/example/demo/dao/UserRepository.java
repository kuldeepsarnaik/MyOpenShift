package com.example.demo.dao;

import com.example.demo.model.user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<user, Integer> {
}
