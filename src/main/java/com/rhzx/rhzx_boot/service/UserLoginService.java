package com.rhzx.rhzx_boot.service;

import com.rhzx.rhzx_boot.po.UserLogin;
import com.rhzx.rhzx_boot.vo.UserLoginVo;

import java.util.List;

public interface UserLoginService {
    void saveUser(UserLoginVo userLogin);

    List<String> getAllUser();

    List<UserLogin> getAllUserList(UserLogin userLogin);

    UserLogin loginUser(String name, String password);

    void updateUserLogin(UserLogin userLogin);

    void deleteUser(UserLoginVo userLogin);
}
