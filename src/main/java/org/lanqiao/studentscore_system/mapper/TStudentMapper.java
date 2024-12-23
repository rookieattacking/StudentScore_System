package org.lanqiao.studentscore_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.studentscore_system.pojo.TStudent;


@Mapper
public interface TStudentMapper {
    // 学生登录
    TStudent login(String studentNo, String password);
}
