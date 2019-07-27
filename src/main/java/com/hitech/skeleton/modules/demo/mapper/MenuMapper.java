package com.hitech.skeleton.modules.demo.mapper;

import com.hitech.skeleton.modules.demo.entity.po.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

	/**
	 * @param text
	 * @return
	 */
	Menu selectByText(@Param("text") String text);
}
