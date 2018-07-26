package com.lanou.controller;

import com.lanou.model.User;
import com.lanou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/insert")
    public  String insert(){
        User user = new User();

        user.setUserName("afd");
        int i = userService.insert(user);
        if (i != 0){
            return "success";
        }else{
            return "failure";
        }
    }

    public String lili(){
        System.out.println("hellow ruirui");
        return "mini";
    }
}
