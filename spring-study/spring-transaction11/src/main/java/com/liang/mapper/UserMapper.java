package com.liang.mapper;

import com.liang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
public interface UserMapper {
    public List<User> selectAll();
    public int addUser(User user);
    public int deleteUser(@Param("id") int id);
}
