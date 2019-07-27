package com.hitech.skeleton.modules.demo.service;

import com.hitech.skeleton.modules.demo.entity.po.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
public interface IMenuService extends IService<Menu> {

	Menu selectByText(String text);

}
