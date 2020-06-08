package com.cn.userrpcdubboprovider2.service.serviceImpl;

import org.apache.dubbo.config.annotation.Service;
import userservice.IUserService;

@Service(interfaceClass = IUserService.class)
public class IUserServiceImpl implements IUserService {
    @Override
    public String getName(Integer id) {
        return "dubbo2";
    }
}
