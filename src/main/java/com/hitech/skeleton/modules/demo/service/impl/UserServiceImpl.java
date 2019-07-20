package com.hitech.skeleton.modules.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hitech.skeleton.modules.demo.entity.po.User;
import com.hitech.skeleton.modules.demo.mapper.UserMapper;
import com.hitech.skeleton.modules.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-07-20
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
