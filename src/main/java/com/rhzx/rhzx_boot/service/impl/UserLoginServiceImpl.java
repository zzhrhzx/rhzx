package com.rhzx.rhzx_boot.service.impl;

import com.rhzx.rhzx_boot.mapper.UserLoginDao;
import com.rhzx.rhzx_boot.po.UserLogin;
import com.rhzx.rhzx_boot.service.UserLoginService;
import com.rhzx.rhzx_boot.vo.UserLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginDao userLoginDao;

    @Override
    public void saveUser(UserLoginVo userLogin) {
        userLogin.setPassword(userLogin.getUserId());
        userLoginDao.saveUser(userLogin);
    }

    @Override
    public List<String> getAllUser() {
        return userLoginDao.getAllUser();
    }

    @Override
    public List<UserLogin> getAllUserList(UserLogin userLogin) {
        return userLoginDao.getAllUserList(userLogin);
    }

    @Override
    public UserLogin loginUser(String name, String password) {
        UserLogin userLogin = userLoginDao.loginUser(name, password);
        if (userLogin == null) {
            return null;
        }
        userLogin.setPassword(null);
        if (userLogin.getLastLoginDate() != null) {
            userLogin.setKibanaUrl("http://10.47.7.202:5601/app/kibana");
        }
        return userLogin;
    }

    @Override
    public void updateUserLogin(UserLogin userLogin) {
        userLogin.setUpdateDate(String.valueOf(new Date()));
        userLogin.setLastUpdateUser(userLogin.getUserId());
        userLoginDao.updateUserLogin(userLogin);
    }

    @Override
    public void deleteUser(UserLoginVo userLogin) {
        userLoginDao.deleteUser(userLogin);
    }
}
