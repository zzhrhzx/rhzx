package com.rhzx.rhzx_boot.service.impl;

import com.rhzx.rhzx_boot.mapper.RoleDao;
import com.rhzx.rhzx_boot.po.Role;
import com.rhzx.rhzx_boot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getRole() {
        return roleDao.getRole();
    }
}
