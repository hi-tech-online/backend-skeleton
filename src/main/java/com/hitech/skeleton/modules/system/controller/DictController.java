package com.hitech.skeleton.modules.system.controller;

import com.hitech.skeleton.modules.system.entity.po.Dict;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

import com.hitech.skeleton.modules.system.service.IDictService;

import java.util.List;

/**
 * <p>
 * 数据字典类型表 前端控制器
 * </p>
 *
 * @author Steven
 * @since 2019-04-27
 */
@RestController
@Slf4j
@RequestMapping("/api/system/dict")
public class DictController {

    @Autowired
    private IDictService dictServiceImpl;

    @PostMapping("")
    public boolean save(Dict dict) {
        log.info("dict: " + dict);
        return dictServiceImpl.save(dict);
    }

    @GetMapping("")
    public List<Dict> list() {
        List<Dict> dicts = dictServiceImpl.list();
        for (Dict dict : dicts) {
            log.info("-> " + dict);
        }
        return dicts;
    }

    @PutMapping("{id}")
    public boolean update(Dict dict) {
        log.info("dict: " + dict);
        return dictServiceImpl.updateById(dict);
    }

}
