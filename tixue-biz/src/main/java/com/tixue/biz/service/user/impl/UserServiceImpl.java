package com.tixue.biz.service.user.impl;

import com.tixue.biz.service.base.TiXueResult;
import com.tixue.biz.service.user.UserService;
import com.tixue.dal.dao.RoleMapper;
import com.tixue.dal.dao.UserInfoMapper;
import com.tixue.dal.dao.UserRoleMapper;
import com.tixue.dal.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMapper roleMapper;

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
    public List<String> getUserRoleCodeByUserId(long userId) {
        List<String> roleList = new ArrayList<>();
        UserRoleExample example = new UserRoleExample();
        UserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<UserRole> list = userRoleMapper.selectByExample(example);
        for (UserRole userRole : list) {
            Role role = roleMapper.selectByPrimaryKey(userRole.getRoleId());
            roleList.add(role.getRoleCode());
        }
        return roleList;
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
