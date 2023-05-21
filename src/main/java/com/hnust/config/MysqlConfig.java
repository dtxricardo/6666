package com.hnust.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@PropertySource("classpath:mysql.properties")
public class MysqlConfig {
    @Value("${mysql.driver}")
    private String driver;
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.username}")
    private String userName;
    @Value("${mysql.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver = "com.mysql.jdbc.Driver");
        ds.setUrl(url="jdbc:mysql://localhost:3306/ssm_course?useSSL=false");
        ds.setUsername(userName="root");
        ds.setPassword(password="123456");
        return ds;
    }
}
