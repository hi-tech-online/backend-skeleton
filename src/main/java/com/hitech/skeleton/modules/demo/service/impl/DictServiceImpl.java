package com.hitech.skeleton.modules.demo.service.impl;

import com.hitech.skeleton.modules.demo.entity.po.Dict;
import com.hitech.skeleton.modules.demo.mapper.DictMapper;
import com.hitech.skeleton.modules.demo.service.IDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 数据字典类型表 服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@Slf4j
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

}
