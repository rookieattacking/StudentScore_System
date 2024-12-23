package org.lanqiao.studentscore_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.studentscore_system.pojo.TUser;


@Mapper
public interface TUserMapper {
    // 教师登录
    TUser login(String userName, String passWord);
}
