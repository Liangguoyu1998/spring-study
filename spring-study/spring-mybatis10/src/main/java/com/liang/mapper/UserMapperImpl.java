package com.liang.mapper;

import com.liang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

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
    public User selectById(int id) {
        //注意，getMapper()方法里的参数应该为UserMapper.class,而不能为UserMapperImpl.class;
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.selectById(id);
    }
}
