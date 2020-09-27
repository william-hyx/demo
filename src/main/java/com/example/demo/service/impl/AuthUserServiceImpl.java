package com.example.demo.service.impl;

import com.example.demo.dao.*;
import com.example.demo.service.AuthUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/27 16:48
 **/
@Slf4j
@Service
public class AuthUserServiceImpl implements AuthUserService {

    @Autowired
    AccountUserDAO accountUserDAO;

    @Autowired
    MemberDAO memberDAO;

    @Autowired
    AccountPlatformDAO accountPlatformDAO;

    @Autowired
    StaffInfoDAO staffInfoDAO;

    @Autowired
    AuthRoleDAO authRoleDAO;

    @Autowired
    AuthUserRoleDAO authUserRoleDAO;

    @Autowired
    AuthRolePrivilegeDAO authRolePrivilegeDAO;

    @Autowired
    AuthOperationDAO authOperationDAO;

    @Autowired
    AuthResourceDAO authResourceDAO;


}
