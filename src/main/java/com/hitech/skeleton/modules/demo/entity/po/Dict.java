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
 * 数据字典类型表
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
public class Dict extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位名称
     */
    @TableField("code")
    private String code;

    /**
     * 注释
     */
    @TableField("remark")
    private String remark;


}
