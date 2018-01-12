package com.tixue.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: T-XUE
 * @Date: Created in 13:54 2018/1/9 0009
 * @Description:
 * @Version: 1.0
 * @Email: tianxue@cqbornsoft.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-09</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name","TiXUE");
        return "index";
    }

    @RequestMapping("index")
    public String index(Model model) {
        return "front/index";
    }
}
