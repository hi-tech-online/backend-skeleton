package com.hitech.skeleton.modules.system.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hitech.skeleton.modules.system.entity.po.Dept;
import com.hitech.skeleton.modules.system.mapper.DeptMapper;
import com.hitech.skeleton.modules.system.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-04-25
 */
@Slf4j
@Service
@DS("ins")
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
