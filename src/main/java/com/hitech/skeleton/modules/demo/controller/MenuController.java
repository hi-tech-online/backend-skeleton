package com.hitech.skeleton.modules.demo.controller;

import com.hitech.skeleton.modules.demo.entity.po.Menu;
import com.hitech.skeleton.modules.demo.service.IMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@RestController
@Slf4j
@RequestMapping("/api/demo/menu")
public class MenuController {

    @Autowired
    private IMenuService menuServiceImpl;

    @GetMapping("hello")
    public Menu hello() {
        return menuServiceImpl.selectByText("员工调岗");
    }

}
