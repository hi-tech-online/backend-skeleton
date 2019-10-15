package com.hitech.skeleton.modules.demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.hitech.skeleton.modules.demo.entity.po.DictDetail;
import com.hitech.skeleton.modules.demo.mapper.DictDetailMapper;
import com.hitech.skeleton.modules.demo.service.IDictDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 数据字典详情表 服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@Slf4j
@Service
public class DictDetailServiceImpl extends ServiceImpl<DictDetailMapper, DictDetail> implements IDictDetailService {

	@DS("a")
	public void test() {

	}
}
