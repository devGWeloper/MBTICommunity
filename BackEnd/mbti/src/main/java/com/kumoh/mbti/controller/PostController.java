package com.kumoh.mbti.controller;

import com.kumoh.mbti.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

// ResposeBody 내포, View대신 html body에 원문을 찍어보냄
@RestController
public class PostController {

    @Autowired
    private PostService postService;
}
