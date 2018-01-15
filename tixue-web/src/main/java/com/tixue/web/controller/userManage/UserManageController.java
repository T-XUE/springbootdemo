package com.tixue.web.controller.userManage;

import com.tixue.biz.service.user.UserService;
import com.tixue.dal.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * @Author: T-XUE
 * @Date: Created in 13:38 2018/1/15 0015
 * @Description:
 * @Version: 1.0
 * @Email: tianxue@cqbornsoft.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-15</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Controller
public class UserManageController {

    @Autowired
    private UserService userService;

    @GetMapping("/toRegister.htm")
    public String toRegister(Model model) {
        return "login/register";
    }

    @PostMapping("/register.htm")
    public String register(String username, String password) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(username);
        userInfo.setLogPassword(new BCryptPasswordEncoder().encode(password));
        userService.insert(userInfo);
        return "login/login";
    }

    @GetMapping("/toLogin.htm")
    public String toLogin(Model model) {
        return "login/login";
    }

    @RequestMapping("/doLogin.htm")
    public String doLogin(String userName, String passWord) {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserName(userName);
//        userInfo.setLogPassword(new BCryptPasswordEncoder().encode(passWord));
//        userService.insert(userInfo);
        return "front/index";
    }

    @GetMapping("user/userCenter.htm")
    public String userCenter(@AuthenticationPrincipal Principal principal, Model model) {
        model.addAttribute("userName",principal.getName());
        return "login/user";
    }
}
