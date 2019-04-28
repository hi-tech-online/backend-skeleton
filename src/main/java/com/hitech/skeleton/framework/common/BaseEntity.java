package com.hitech.skeleton.framework.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Steven
 */
@Data
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	/**
	 * 创建时间
	 */
	@TableField(value = "gmt_create", fill = FieldFill.INSERT)
	private LocalDateTime gmtCreate;

	/**
	 * 修改时间
	 */
	@TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime gmtModified;

}
