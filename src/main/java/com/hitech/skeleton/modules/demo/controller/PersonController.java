package com.hitech.skeleton.modules.demo.controller;

import com.hitech.skeleton.framework.annotation.RestResult;
import com.hitech.skeleton.modules.demo.entity.po.Person;
import com.hitech.skeleton.modules.demo.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/api/demo/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping("{id}")
    @RestResult
    @Transactional(rollbackFor = Exception.class)
    public Person getById(@PathVariable("id") Long id) {
        Person person = personService.getById(id);
        return person;
    }

    @PostMapping("/add")
    @Transactional(rollbackFor = Exception.class)
    public void add() {
        personService.addBatch();
    }

}
