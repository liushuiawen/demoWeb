package com.example.demo.controller;

import com.example.demo.dao.TestDao;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019-09-07.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String  testJdbcTemplate(){
        return testService.testJdbcTemplate();
    }
}
