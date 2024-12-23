package org.lanqiao.studentscore_system.service;

import org.lanqiao.studentscore_system.pojo.TUser;

public interface TUserService {
    // 教师登录
    TUser login(String userName, String passWord);
}
