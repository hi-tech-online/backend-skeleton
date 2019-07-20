package com.hitech.skeleton.modules.demo.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.hitech.skeleton.framework.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Steven
 * @since 2019-07-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 头像地址
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 用户名称
     */
    @TableField("username")
    private String username;

    /**
     * 用户类型（'S':员工, 'C':客户,'C':合作伙伴）
     */
    @TableField("user_type")
    private String userType;


}
