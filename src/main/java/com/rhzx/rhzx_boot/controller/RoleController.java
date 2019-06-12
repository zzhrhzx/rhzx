package com.rhzx.rhzx_boot.controller;

import com.rhzx.rhzx_boot.po.Role;
import com.rhzx.rhzx_boot.service.RoleService;
import com.rhzx.rhzx_boot.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = {"/getRole"}, method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public Response login(HttpServletResponse response, HttpServletRequest request) {
        List<Role> role = roleService.getRole();
        return new Response().success(role);
    }
}
