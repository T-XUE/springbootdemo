package com.tixue.biz.service.user;

import com.tixue.dal.model.UserInfo;

/**
 * @Author: T-XUE
 * @Date: Created in 11:42 2018/1/15 0015
 * @Description:
 * @Version: 1.0
 * @Email: tianxue@cqbornsoft.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-15</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface UserService {

    /**
     * 根据用户名查找
     * @param userName
     * @return
     */
    UserInfo getByUsername(String userName);
}
