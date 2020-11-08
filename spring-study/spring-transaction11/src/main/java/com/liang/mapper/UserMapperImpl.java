package com.liang.mapper;

import com.liang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSessionTemplate;
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    public List<User> selectAll() {
        User user = new User(5, "小华", "987852");
        addUser(user);
        deleteUser(5);
        return sqlSessionTemplate.getMapper(UserMapper.class).selectAll();
    }

    public int addUser(User user) {
        return sqlSessionTemplate.getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return sqlSessionTemplate.getMapper(UserMapper.class).deleteUser(id);
    }
}
