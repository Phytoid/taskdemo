package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}

/*
 * JpaRepository is an interface which contains the list of all the methods
 * which can use for insert,delete,update or view
 * apart from that u can also do pagination here
 */