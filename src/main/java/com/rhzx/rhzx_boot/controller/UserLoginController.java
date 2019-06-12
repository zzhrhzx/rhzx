package com.rhzx.rhzx_boot.controller;

import com.rhzx.rhzx_boot.po.UserLogin;
import com.rhzx.rhzx_boot.service.RoleService;
import com.rhzx.rhzx_boot.service.UserLoginService;
import com.rhzx.rhzx_boot.util.InputCheckUtil;
import com.rhzx.rhzx_boot.util.Response;
import com.rhzx.rhzx_boot.vo.UserLoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/login")
public class UserLoginController {
    private Logger logger = LoggerFactory.getLogger(UserLoginController.class);
    @Autowired
    private UserLoginService userLoginService;
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody
    private Response saveUser(HttpServletRequest request, @RequestBody UserLoginVo userLogin) {
        logger.info("info{}:" + userLogin);
        //List<Role> roleList = roleService.getRole();
        InputCheckUtil.checkNotEmpty(userLogin.getUserId(), "用户名");
        InputCheckUtil.checkNotEmpty(userLogin.getRole(), "用户角色");
        if (!userLogin.getCreateRole().equals("00") && !userLogin.getCreateRole().equals("01")) {//判断用户是否是超级管理员和管理员
            return new Response().success("无权限添加！！！");
        } else if (userLogin.getCreateRole().equals("00")) {//判断是否是超级管理员权限
            userLoginService.saveUser(userLogin);
        } else if (userLogin.getCreateRole().equals("01") && !userLogin.getRole().equals("00") && !userLogin.getRole().equals("01")) {//添加普通用户
            userLoginService.saveUser(userLogin);
        } else {
            return new Response().success("无权限添加！！！");
        }
        return new Response().success();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Response login(HttpServletResponse response, HttpServletRequest request, @RequestParam String userId, @RequestParam String password) throws IOException {
        List<String> allUser = userLoginService.getAllUser();
        if (allUser.contains(userId) != true) {
            return new Response().success("用户名不存在！");
        }
        UserLogin userLogin = userLoginService.loginUser(userId, password);
        if (userLogin == null) {
            return new Response().success("密码错误");
        }
        return new Response().success(userLogin);
    }

    @RequestMapping(value = "/updateUserLogin", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody
    private Response updateUserLogin(HttpServletRequest request, @RequestBody UserLogin userLogin) {
        userLoginService.updateUserLogin(userLogin);
        return new Response().success("密码修改成功！");
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    private Response deleteUser(HttpServletRequest request, @RequestBody UserLoginVo userLogin) {
        InputCheckUtil.checkNotEmpty(userLogin.getUserId(), "用户名");
        InputCheckUtil.checkNotEmpty(userLogin.getRole(), "角色");
        InputCheckUtil.checkNotEmpty(userLogin.getCreateRole(), "删除人角色");
        if (!userLogin.getCreateRole().equals("00") && !userLogin.getCreateRole().equals("01")) {//判断用户是否是超级管理员和管理员
            return new Response().success("无权限删除！！！");
        } else if (userLogin.getCreateRole().equals("00")) {//判断是否是超级管理员权限
            userLoginService.deleteUser(userLogin);
        } else if (userLogin.getCreateRole().equals("01") && !userLogin.getRole().equals("00") && !userLogin.getRole().equals("01")) {//删除普通用户
            userLoginService.deleteUser(userLogin);
        } else {
            return new Response().success("无权限删除！！！");
        }
        return new Response().success();
    }
}
