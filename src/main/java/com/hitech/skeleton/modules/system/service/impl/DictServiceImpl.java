package com.hitech.skeleton.modules.system.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.hitech.skeleton.modules.system.entity.po.Dict;
import com.hitech.skeleton.modules.system.mapper.DictMapper;
import com.hitech.skeleton.modules.system.service.IDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

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
@DS("base")
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

}
