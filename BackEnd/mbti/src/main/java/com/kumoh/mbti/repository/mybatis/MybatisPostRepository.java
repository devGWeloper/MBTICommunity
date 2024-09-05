package com.kumoh.mbti.repository.mybatis;

import com.kumoh.mbti.mapper.PostMapper;
import com.kumoh.mbti.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisPostRepository implements PostRepository {
    private final PostMapper postMapper;

    @Autowired
    public MybatisPostRepository(PostMapper postMapper){
        this.postMapper = postMapper;
    }
}
