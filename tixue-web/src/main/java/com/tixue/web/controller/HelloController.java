package com.tixue.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: T-XUE
 * @Date: Created in 13:54 2018/1/9 0009
 * @Description:
 * @Version: 1.0
 * @Email: t_xue@foxmail.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-09</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Controller
public class HelloController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name","TiXUE");
        return "index";
    }

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("service", "index");
        return "front/index";
    }

    @RequestMapping("{service}.htm")
    public String vacation(Model model, HttpServletRequest request, HttpServletResponse response,
                           @PathVariable String service) {
        logger.info("进入页面{}", service);
        model.addAttribute("service", service);
        return"front/" + service;
    }

    @RequestMapping("admin/login.htm")
    public String backstageLogin(Model model) {
        return "backstage/login";
    }
}
