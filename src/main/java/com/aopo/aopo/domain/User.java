package com.aopo.aopo.domain;


import com.aopo.aopo.domain.mapper.UserMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

/**
 * @author mr.yang
 */
@Getter
@Setter
@ToString
public class User {

    private int id;
    private String name;
    private int age;

}
