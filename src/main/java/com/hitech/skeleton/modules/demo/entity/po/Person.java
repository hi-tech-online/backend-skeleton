package com.hitech.skeleton.modules.demo.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author Steven
 * @since 2019-07-20
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@KeySequence("SEQ$ORD_ID")
public class Person {

	private static final long serialVersionUID = 1L;

	@TableId(value = "ID", type = IdType.INPUT)
	private Long id;

	/**
	 * 姓名
	 */
	@TableField("name")
	private String name;

	/**
	 * 年龄
	 */
	@TableField("age")
	private Integer age;

	/**
	 * 邮箱
	 */
	@TableField("email")
	private String email;

	/**
	 * 直属上级id
	 */
	@TableField("manager_id")
	private Long managerId;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private LocalDateTime createTime;

	/**
	 * 备注
	 */
	@TableField(exist = false)
	private String remark;

}
