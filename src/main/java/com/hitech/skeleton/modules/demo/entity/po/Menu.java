package com.hitech.skeleton.modules.demo.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.hitech.skeleton.framework.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Menu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 父菜单ID
     */
    @TableField("pid")
    private Long pid;

    /**
     * 应用模式（'N': Normal:, 'P': PC:, 'A': App, 'M': Mini program）
     */
    @TableField("apply_mode")
    private String applyMode;

    /**
     * 菜单文本
     */
    @TableField("text")
    private String text;

    @TableField("icon")
    private String icon;

    /**
     * 菜单路径
     */
    @TableField("path")
    private String path;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;


}
