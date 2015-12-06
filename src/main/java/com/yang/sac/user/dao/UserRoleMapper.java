package com.yang.sac.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yang.sac.user.domain.UserRole;

@Repository
public interface UserRoleMapper {

	List<UserRole> selectUserRoleByUserName(String userName);

}