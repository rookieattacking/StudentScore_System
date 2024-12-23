package org.lanqiao.studentscore_system.service;

import org.lanqiao.studentscore_system.pojo.TStudent;

public interface TStudentService {
    // 学生登录
    TStudent login(String studentNo, String password);
}
