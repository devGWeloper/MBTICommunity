package com.kumoh.mbti.controller;

import com.kumoh.mbti.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    @Autowired
    private PostService postService;
}
