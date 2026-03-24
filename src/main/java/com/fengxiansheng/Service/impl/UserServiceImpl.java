package com.fengxiansheng.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengxiansheng.Entity.User;
import com.fengxiansheng.Mapper.UserMapper;
import com.fengxiansheng.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
