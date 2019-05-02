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
 * 数据字典详情表
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
public class DictDetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 字典ID
     */
    @TableField("dict_id")
    private Long dictId;

    /**
     * 显示
     */
    @TableField("text")
    private String text;

    /**
     * 值
     */
    @TableField("value")
    private String value;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;


}
