package com.hitech.skeleton.modules.demo.entity.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 数据字典类型表
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dict {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位名称
     */
    @TableField("code")
    private String code;

    /**
     * 注释
     */
    @TableField(value = "remark", strategy = FieldStrategy.NOT_EMPTY)
    private String remark;

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

    /**
     * 是否有效（1:有效, 0:失效）
     */
    @TableField("enabled")
    private Boolean enabled;
}
