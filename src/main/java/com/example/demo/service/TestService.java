package com.example.demo.service;

import com.example.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019-09-07.
 */
@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public String testJdbcTemplate(){
        return testDao.testJdbcTemplate();
    }

}
