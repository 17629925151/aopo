package com.aopo.aopo.service;

import com.aopo.aopo.domain.User;
import com.aopo.aopo.domain.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mr.yang
 */




public interface UserService  {


    String getName();

    List<User> getAll();


    String getResponse();
}


