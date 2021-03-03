package cn.tedu.web;

import cn.tedu.service.UserService;
import cn.tedu.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserServlet {

    @Autowired
    private UserService userService = null;

    public void test(){
        userService.regist();
        //userService.login();
        //userService.update();
    }

}
