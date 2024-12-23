package org.lanqiao.studentscore_system.controller;

import org.lanqiao.studentscore_system.dto.user.StudentLogin;
import org.lanqiao.studentscore_system.dto.user.UserLogin;
import org.lanqiao.studentscore_system.pojo.TStudent;
import org.lanqiao.studentscore_system.pojo.TUser;
import org.lanqiao.studentscore_system.service.TStudentService;
import org.lanqiao.studentscore_system.service.TUserService;
import org.lanqiao.studentscore_system.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TUserController {
    @Autowired
    private TUserService tUserService;
    @Autowired
    private TStudentService tStudentService;
    @RequestMapping("/login")
    public ResponseUtil login(@RequestBody UserLogin userLong){
        TUser login = tUserService.login(userLong.getUserName(), userLong.getPassword());
        if(login != null){
            return new ResponseUtil(200,"登录成功");
        }else{
            return new ResponseUtil(405,"登录失败");
        }

    }
    @RequestMapping("/studentlogin")
    public ResponseUtil stuLogin(@RequestBody StudentLogin studentLogin){
        TStudent login = tStudentService.login(studentLogin.getStudentNo(), studentLogin.getPassword());
        if(login != null){
            return new ResponseUtil(200,"登录成功");
        }else{
            return new ResponseUtil(405,"登录失败");
        }
    }

}
