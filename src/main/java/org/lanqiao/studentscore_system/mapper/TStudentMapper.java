package org.lanqiao.studentscore_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.studentscore_system.pojo.TStudent;

import java.util.List;


@Mapper
public interface TStudentMapper {
    // 学生登录
    TStudent login(String studentNo, String password);

    // 获取所有的学生
    List<TStudent> getAllStudent();
}
