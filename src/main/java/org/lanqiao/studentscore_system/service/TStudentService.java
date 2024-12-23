package org.lanqiao.studentscore_system.service;

import org.lanqiao.studentscore_system.pojo.TStudent;

import java.util.List;

public interface TStudentService {
    // 学生登录
    TStudent login(String studentNo, String password);
    // 获取所有的学生
    List<TStudent> getAllStudent();
}
