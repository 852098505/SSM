package cn.tedu.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void regist() {
        System.out.println("regist..");
    }

    @Override
    public void login() {
        System.out.println("login..");
    }

    @Override
    public void update() {
        System.out.println("update..");
    }

    @Override
    public void delete() {
        System.out.println("delete..");
    }

}
