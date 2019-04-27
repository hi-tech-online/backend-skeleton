package com.hitech.skeleton.modules.system.controller;

import com.hitech.skeleton.common.Result;
import com.hitech.skeleton.modules.system.entity.po.Dict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

import com.hitech.skeleton.common.IResult;
import com.hitech.skeleton.modules.system.service.IDictService;

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
@RequestMapping("/api/system/dict")
public class DictController {

    @Autowired
    private IDictService dictServiceImpl;

    @GetMapping("list")
    public List<Dict> list() {
        return dictServiceImpl.list();
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
