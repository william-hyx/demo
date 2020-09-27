package com.example.demo.controller;

import com.example.demo.service.AuthUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/27 16:48
 **/
@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = "/auth-user")
public class AuthUserController {
    @Autowired
    AuthUserService authUserService;


}
