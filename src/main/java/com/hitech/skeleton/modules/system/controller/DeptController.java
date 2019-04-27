package com.hitech.skeleton.modules.system.controller;

import com.hitech.skeleton.annotation.RestResult;
import com.hitech.skeleton.common.IResult;
import com.hitech.skeleton.common.Result;
import com.hitech.skeleton.modules.system.entity.po.Dept;
import com.hitech.skeleton.modules.system.service.IDeptService;
import com.hitech.skeleton.utils.ValidationUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    private static final String ENTITY_NAME = "dept";

    @Autowired
    private IDeptService deptServiceImpl;

    @GetMapping("list")
    @RestResult
    public List<Dept> list() {
        return deptServiceImpl.list();
    }

    @GetMapping("list2")
    public List<Dept> list2() {
        return deptServiceImpl.list();
    }

    @GetMapping("{id}")
    @RestResult
    public Dept getById(Long id) {
        return deptServiceImpl.getById(id);
    }

    @DeleteMapping("{id}")
    @RestResult
    public Boolean removeById(Long id) {
        return deptServiceImpl.removeById(id);
    }

}
