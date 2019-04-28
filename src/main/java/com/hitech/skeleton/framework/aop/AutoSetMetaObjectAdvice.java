package com.hitech.skeleton.framework.aop;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 实现公共字段自动设置
 *
 * @author Steven
 * @date 2019-04-28
 */
@Component
public class AutoSetMetaObjectAdvice implements MetaObjectHandler {

	/**
	 * 在新增记录时自动设置。
	 *
	 * @param metaObject
	 */
	@Override
	public void insertFill(MetaObject metaObject) {
		LocalDateTime localDateTime = LocalDateTime.now();
		this.setFieldValByName("gmtCreate", localDateTime, metaObject);
		this.setFieldValByName("gmtModified", localDateTime, metaObject);

	}

	/**
	 * 在修改记录时自动设置
	 *
	 * @param metaObject
	 */
	@Override
	public void updateFill(MetaObject metaObject) {
		this.setFieldValByName("gmtModified", LocalDateTime.now(), metaObject);
	}
}
