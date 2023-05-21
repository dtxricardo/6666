package com.hnust.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan({"com.hnust.service","com.hnust.entity"})
@Import({MysqlConfig.class,MybatisConfig.class})
public class SpringConfig {

}
