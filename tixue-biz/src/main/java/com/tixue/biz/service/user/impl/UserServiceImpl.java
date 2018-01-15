package com.tixue.biz.service.user.impl;

import com.tixue.biz.service.base.TiXueResult;
import com.tixue.biz.service.user.UserService;
import com.tixue.dal.dao.UserInfoMapper;
import com.tixue.dal.model.UserInfo;
import com.tixue.dal.model.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getByUsername(String userName) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (userInfos != null && userInfos.size() > 0) {
            return userInfos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public TiXueResult insert(UserInfo userInfo) {
        TiXueResult result = new TiXueResult();
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userInfo.getUserName());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (userInfos != null && userInfos.size() > 0) {
            result.setSuccess(false);
            result.setMessage("用户名已存在");
            return result;
        }
        userInfoMapper.insert(userInfo);
        result.setSuccess(true);
        result.setMessage("注册成功");
        return result;
    }
}
