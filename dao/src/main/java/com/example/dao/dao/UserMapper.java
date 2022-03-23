package com.example.dao.dao;

import com.example.dao.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {


    @Select("select * from user")
    List<User> selectAll();
}
