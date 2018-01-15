package com.tixue.biz.service.user.impl;

import com.tixue.biz.service.user.UserService;
import com.tixue.dal.dao.UserInfoMapper;
import com.tixue.dal.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: T-XUE
 * @Date: Created in 11:42 2018/1/15 0015
 * @Description:
 * @Version: 1.0
 * @Email: tianxue@cqbornsoft.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-15</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getByUsername(String userName) {
        return userInfoMapper.selectByUsername(userName);
    }

    @Override
    public int insert(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }
}
