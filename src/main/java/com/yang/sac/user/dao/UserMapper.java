package com.yang.sac.user.dao;

import org.springframework.stereotype.Repository;

import com.yang.sac.user.domain.User;

@Repository
public interface UserMapper
{
	User selectByUserName(String userName);
}