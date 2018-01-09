package com.tixue.web.controller;

import com.tixue.dal.model.User;
import com.tixue.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: T-XUE
 * @Date: Created in 14:43 2018/1/9 0009
 * @Description:
 * @Version: 1.0
 * @Email: tianxue@cqbornsoft.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-09</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getUserName")
    public String getUserName(int userId) {
        User user = userService.findById(userId);
        return user.toString();
    }
}