package com.tixue.web.controller.userManage;

import com.tixue.biz.service.base.TiXueResult;
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

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

/**
 * @Author: T-XUE
 * @Date: Created in 13:38 2018/1/15 0015
 * @Description:
 * @Version: 1.0
 * @Email: t_xue@foxmail.com
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
    public String register(String username, String password, HttpServletResponse response) throws IOException {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(username);
        userInfo.setLogPassword(new BCryptPasswordEncoder().encode(password));
        TiXueResult result = userService.insert(userInfo);
        response.sendRedirect("/toLogin.htm");
        return null;
    }

    @GetMapping("/toLogin.htm")
    public String toLogin(Model model) {
        return "login/login";
    }

    @GetMapping("user/userCenter.htm")
    public String userCenter(@AuthenticationPrincipal Principal principal, Model model) {
        model.addAttribute("userName",principal.getName());
        return "login/user";
    }
}
