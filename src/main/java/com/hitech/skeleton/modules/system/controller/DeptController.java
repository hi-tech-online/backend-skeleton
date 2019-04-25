package com.hitech.skeleton.modules.system.controller;

import com.hitech.skeleton.common.Result;
import com.hitech.skeleton.modules.system.entity.po.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

import com.hitech.skeleton.common.IResult;
import com.hitech.skeleton.modules.system.service.IDeptService;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Steven
 * @since 2019-04-25
 */
@RestController
@Slf4j
@RequestMapping("/api/system/dept")
public class DeptController {

    @Autowired
    private IDeptService deptServiceImpl;

    @GetMapping("list")
    public IResult list() {
        List<Dept> depts = deptServiceImpl.list();
        return Result.success(depts);
    }

    @GetMapping("{id}")
    public IResult getById(Long id) {
        return null;
    }

    @DeleteMapping("{id}")
    public IResult removeById(Long id) {
        return null;
    }

}
