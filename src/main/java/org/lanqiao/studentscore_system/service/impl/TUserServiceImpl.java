package org.lanqiao.studentscore_system.service.impl;

import org.lanqiao.studentscore_system.mapper.TUserMapper;
import org.lanqiao.studentscore_system.pojo.TUser;
import org.lanqiao.studentscore_system.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl implements TUserService {
    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser login(String userName, String passWord) {
        TUser login = userMapper.login(userName, passWord);
        if(login != null){
            return login;
        }else{
            return null;
        }
    }
}
