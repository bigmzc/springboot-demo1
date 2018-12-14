package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/query")
@Log4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<User> test(){
        List<User> users = userService.queryAllUser();
        return users;
    }

    @RequestMapping("/test2")
    public String getIndexPage(){
        return "redirect:/index.jsp";
    }
}
