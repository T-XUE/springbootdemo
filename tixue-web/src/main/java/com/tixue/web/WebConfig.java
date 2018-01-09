package com.tixue.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: T-XUE
 * @Date: Created in 16:02 2018/1/9 0009
 * @Description:
 * @Version: 1.0
 * @Email: tianxue@cqbornsoft.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-09</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.tixue.biz")
@MapperScan("com.tixue.dal.dao")
public class WebConfig extends WebMvcConfigurerAdapter {

}
