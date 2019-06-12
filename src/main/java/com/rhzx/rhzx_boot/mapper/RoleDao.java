package com.rhzx.rhzx_boot.mapper;

import com.rhzx.rhzx_boot.po.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleDao {
    List<Role> getRole();
}
