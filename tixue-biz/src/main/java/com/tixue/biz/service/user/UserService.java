package com.tixue.biz.service.user;

import com.tixue.biz.service.base.TiXueResult;
import com.tixue.dal.model.UserInfo;

import java.util.List;

/**
 * @Author: T-XUE
 * @Date: Created in 11:42 2018/1/15 0015
 * @Description:
 * @Version: 1.0
 * @Email: t_xue@foxmail.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-15</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface UserService {

    /**
     * 根据用户名查找
     *
     * @param userName
     * @return
     */
    UserInfo getByUsername(String userName);

    /**
     * 获取用户的角色
     *
     * @param userId
     * @return
     */
    List<String> getUserRoleCodeByUserId(long userId);

    TiXueResult insert(UserInfo userInfo);
}
