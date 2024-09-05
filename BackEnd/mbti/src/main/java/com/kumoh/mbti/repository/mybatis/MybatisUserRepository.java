package com.kumoh.mbti.repository.mybatis;

import com.kumoh.mbti.mapper.UserMapper;
import com.kumoh.mbti.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisUserRepository implements UserRepository {

    private final UserMapper userMapper;

    @Autowired
    public MybatisUserRepository(UserMapper userMapper){
        this.userMapper = userMapper;
    }
}
