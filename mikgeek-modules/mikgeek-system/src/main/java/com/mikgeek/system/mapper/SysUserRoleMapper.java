package com.mikgeek.system.mapper;

import com.mikgeek.common.mybatis.core.mapper.BaseMapperPlus;
import com.mikgeek.system.domain.SysUserRole;

import java.util.List;

/**
 * 用户与角色关联表 数据层
 *
 * @author chenkunbest
 */
public interface SysUserRoleMapper extends BaseMapperPlus<SysUserRoleMapper, SysUserRole, SysUserRole> {

    List<Long> selectUserIdsByRoleId(Long roleId);

}