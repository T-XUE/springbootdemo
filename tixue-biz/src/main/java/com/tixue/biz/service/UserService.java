package com.tixue.biz.service;

import com.tixue.dal.model.User;

/**
 * @Author: T-XUE
 * @Date: Created in 14:42 2018/1/9 0009
 * @Description:
 * @Version: 1.0
 * @Email: t_xue@foxmail.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-09</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface UserService {
    User findById(int id);
}
