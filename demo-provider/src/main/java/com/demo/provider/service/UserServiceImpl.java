package com.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.UserService;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/3/20
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(String info) {
        return info;
    }
}
