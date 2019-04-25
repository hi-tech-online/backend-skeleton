package com.hitech.skeleton.common;

import lombok.Data;

import java.util.List;

/**
 * @author Steven
 * @date 2019-04-25
 */
@Data
public class TreeNode {

    /**
     * ID
     */
    private Long id;

    /**
     * 父ID
     */
    private Long pid;

    /**
     * 展示文字
     */
    private String text;


    /**
     * 节点开启状态
     */
    private String state = "open";


    /**
     * 子节点
     */
    private List<TreeNode> children;

}
