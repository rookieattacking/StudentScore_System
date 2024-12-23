package org.lanqiao.studentscore_system.service.impl;

import org.lanqiao.studentscore_system.mapper.TStudentMapper;
import org.lanqiao.studentscore_system.pojo.TStudent;
import org.lanqiao.studentscore_system.service.TStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TStudentServiceImpl implements TStudentService {
    @Autowired
    private TStudentMapper tStudentMapper;
    // 登录功能
    @Override
    public TStudent login(String studentNo, String password) {
        TStudent login = tStudentMapper.login(studentNo, password);
        if(login != null){
            return login;
        }
        return null;
    }
    // 获取所有的学生
    @Override
    public List<TStudent> getAllStudent() {
        List<TStudent> allStudent = tStudentMapper.getAllStudent();
        if(allStudent != null){
            return allStudent;
        }
        return null;
    }
}
