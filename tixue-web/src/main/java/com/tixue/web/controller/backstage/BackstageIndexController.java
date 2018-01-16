package com.tixue.web.controller.backstage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: T-XUE
 * @Date: Created in 17:10 2018/1/16 0016
 * @Description:
 * @Version: 1.0
 * @Email: tianxue@cqbornsoft.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-16</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Controller
public class BackstageIndexController {

    @RequestMapping("backstage/login")
    public String backstageLogin(Model model) {
        model.addAttribute("service", "index");
        return "backstage/login";
    }
}
