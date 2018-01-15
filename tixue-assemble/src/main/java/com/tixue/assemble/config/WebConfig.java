package com.tixue.assemble.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: T-XUE
 * @Date: Created in 16:02 2018/1/9 0009
 * @Description:
 * @Version: 1.0
 * @Email: t_xue@foxmail.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-09</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tixue.biz")
@ComponentScan(basePackages = "com.tixue.web")
@MapperScan("com.tixue.dal.dao")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * # 默认值为 /**
     * spring.mvc.static-path-pattern=/**
     * # 默认值为 classpath:/META-INF/resources/,classpath:/resources/,classpath:/static/,classpath:/public/
     * spring.resources.static-locations=classpath:/static/
     * 声明静态资源文件目录
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
}