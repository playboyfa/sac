package com.yang.sac.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yang.sac.user.domain.RoleMenuRs;

@Repository
public interface RoleMenuRsMapper {

	List<RoleMenuRs> selectAllRoleMenuRs();
}