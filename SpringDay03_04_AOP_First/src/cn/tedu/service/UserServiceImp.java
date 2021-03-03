package cn.tedu.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Override
    public void addUser() {
        System.out.println("新增用户。。");
    }

    @Override
    public void quarUser() {
        System.out.println("查询用户。。");
    }
}
