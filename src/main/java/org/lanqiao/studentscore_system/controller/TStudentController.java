package org.lanqiao.studentscore_system.controller;

import org.lanqiao.studentscore_system.dto.student.StudentList;
import org.lanqiao.studentscore_system.pojo.TStudent;
import org.lanqiao.studentscore_system.service.TStudentService;
import org.lanqiao.studentscore_system.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class TStudentController {
    @Autowired
    private TStudentService tStudentService;
    @RequestMapping("/getAllStudent")
    public ResponseUtil getAllStudent(){
        List<TStudent> allStudent = tStudentService.getAllStudent();
        if(allStudent != null){
            List<StudentList> studentLists = new ArrayList<>();
            for (TStudent tStudent : allStudent) {
                StudentList studentList = new StudentList();
                studentList.setStudentNo(tStudent.getStudentNo());
                studentList.setStudentName(tStudent.getStudentName());
                studentList.setStudentSex(tStudent.getStudentSex());
                studentLists.add(studentList);
            }
            return new ResponseUtil(200,"查询成功",studentLists);
        }else{
            return new ResponseUtil(405,"查询失败");
        }

    }
}
