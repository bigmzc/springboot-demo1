package com.baizhi.test;

import com.alibaba.fastjson.JSON;
import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUser(){
        List<User> users = userMapper.queryAllUser();
        System.out.println(users);
    }

    @Test
    public void testFastJson(){
        //测试userid不参与序列化
        List<User> users = userMapper.queryAllUser();
        String jsonString = JSON.toJSONString(users);
        System.out.println(jsonString);
    }
}
