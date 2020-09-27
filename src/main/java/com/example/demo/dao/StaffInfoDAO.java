package com.example.demo.dao;

import com.example.demo.po.StaffInfo;
import org.springframework.stereotype.Repository;

/**
 * StaffInfoDAO继承基类
 */
@Repository
public interface StaffInfoDAO extends MyBatisBaseDao<StaffInfo, Long> {
}