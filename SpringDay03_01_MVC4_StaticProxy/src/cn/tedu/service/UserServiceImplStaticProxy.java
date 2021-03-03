package cn.tedu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImplStaticProxy implements UserService {

    @Autowired
    private UserServiceImpl userService = null;

    @Override
    public void regist() {
        try {
            System.out.println("#记录日志..");
            System.out.println("#权限控制..");
            System.out.println("#开启事务..");

            userService.regist();

            System.out.println("#提交事务..");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("#回滚事务..");
        }
    }

    @Override
    public void login() {
        try {
            System.out.println("#记录日志..");
            System.out.println("#权限控制..");
            System.out.println("#开启事务..");

            userService.login();

            System.out.println("#提交事务..");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("#回滚事务..");
        }
    }

    @Override
    public void update() {
        try {
            System.out.println("#记录日志..");
            System.out.println("#权限控制..");
            System.out.println("#开启事务..");

            userService.update();

            System.out.println("#提交事务..");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("#回滚事务..");
        }
    }

    @Override
    public void delete() {
        try {
            System.out.println("#记录日志..");
            System.out.println("#权限控制..");
            System.out.println("#开启事务..");

            userService.delete();

            System.out.println("#提交事务..");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("#回滚事务..");
        }
    }
}
