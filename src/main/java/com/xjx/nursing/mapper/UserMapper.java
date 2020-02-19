package com.xjx.nursing.mapper;

import com.xjx.nursing.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    // 查询全部用户
    List<User> selectAllUser();
    /***
     * 用户登录
     */
    User selectselectByKeyAndPassword(User user);
    int getUsernumber();
}