package com.rhzx.rhzx_boot.mapper;

import com.rhzx.rhzx_boot.po.UserLogin;
import com.rhzx.rhzx_boot.vo.UserLoginVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserLoginDao {
    void saveUser(UserLoginVo userLogin);

    List<String> getAllUser();

    List<UserLogin> getAllUserList(@Param("userLogin") UserLogin userLogin);

    UserLogin loginUser(@Param("userId") String name, @Param("password") String password);

    void updateUserLogin(@Param("userLogin") UserLogin userLogin);

    void deleteUser(@Param("userLogin") UserLoginVo userLogin);
}
