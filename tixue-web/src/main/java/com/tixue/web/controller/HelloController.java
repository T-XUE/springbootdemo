package com.tixue.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.tixue.dal.dao.UserInfoMapper;
import com.tixue.dal.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name", "TiXUE");
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
        return "front/" + service;
    }

    @ResponseBody
    @RequestMapping("hello.json")
    public Object helloJson(Model model) {
        JSONObject jsonObject = new JSONObject();
        UserInfo userInfo = userInfoMapper.selectByUsername("tx");
        jsonObject.put("姓名", userInfo.getUserName());
        jsonObject.put("年龄", userInfo.getUserId());
        return jsonObject;
    }

    @RequestMapping("backstageLogin.htm")
    public String backstageLogin(Model model) {
        return "backstage/login";
    }
}
