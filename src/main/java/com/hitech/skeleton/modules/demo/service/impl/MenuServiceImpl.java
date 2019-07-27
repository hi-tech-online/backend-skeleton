package com.hitech.skeleton.modules.demo.service.impl;

import com.hitech.skeleton.modules.demo.entity.po.Menu;
import com.hitech.skeleton.modules.demo.mapper.MenuMapper;
import com.hitech.skeleton.modules.demo.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@Slf4j
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

	@Autowired
	private MenuMapper menuMapper;

	@Override
	public Menu selectByText(String text) {
		return menuMapper.selectByText(text);
	}
}
