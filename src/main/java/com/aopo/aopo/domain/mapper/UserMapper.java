package com.aopo.aopo.domain.mapper;


import com.aopo.aopo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author mr.yang
 */


@Mapper
public interface UserMapper {

    @Select("select * from user_bu")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "age",column = "age")
    })
    List<User> getAll();

    @Select("select name from user_bu where id = 1")
    @Result(property = "name",column = "name")


    String getName();




}
