package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019-09-07.
 */

@Repository
public class TestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String testJdbcTemplate(){
        String ass=jdbcTemplate.queryForObject("select 54 from dual",String.class);
        return ass;
    }

}
