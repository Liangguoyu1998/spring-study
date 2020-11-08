package com.liang.mapper;

import com.liang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-30 2020/10/30
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport  implements UserMapper {
    public User selectById(int id) {
        return getSqlSession().getMapper(UserMapper.class).selectById(id);
    }
}
