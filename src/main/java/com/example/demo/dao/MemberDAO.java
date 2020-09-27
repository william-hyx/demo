package com.example.demo.dao;

import com.example.demo.po.Member;
import org.springframework.stereotype.Repository;

/**
 * MemberDAO继承基类
 */
@Repository
public interface MemberDAO extends MyBatisBaseDao<Member, Long> {
}