package com.hitech.skeleton.modules.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hitech.skeleton.framework.annotation.RestResult;
import com.hitech.skeleton.modules.demo.entity.po.Dict;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

import com.hitech.skeleton.modules.demo.service.IDictService;

import java.util.List;

/**
 * <p>
 * 数据字典类型表 前端控制器
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@RestController
@Slf4j
@RequestMapping("/api/demo/dict")
public class DictController {

    @Autowired
    private IDictService dictServiceImpl;

    // ==========
    // === 增 ===
    // ==========

    /**
     * 新增记录
     *
     * @param dict
     * @return
     */
    @PostMapping("/save")
    @RestResult
    public boolean save(Dict dict) {
        return dictServiceImpl.save(dict);
    }

    /**
     * 记录存在就更新，否则插入一条记录
     *
     * @param dict
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @RestResult
    public boolean saveOrUpdate(Dict dict) {
        return dictServiceImpl.saveOrUpdate(dict);
    }


    // ==========
    // === 删 ===
    // ==========

    /**
     * 根据主键删除记录
     *
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    @RestResult
    public boolean remove(Long id) {
        return dictServiceImpl.removeById(id);
    }

    /**
     * 根据条件删除记录
     *
     * @param enabled
     * @return
     */
    @DeleteMapping
    @RestResult
    public boolean removeByQueryWrapper(@RequestParam("enabled") boolean enabled) {
        return dictServiceImpl.remove(
            new QueryWrapper<Dict>().lambda().
                eq(Dict::getEnabled, enabled)
        );
    }

    // ==========
    // === 查 ===
    // ==========

    /**
     * 根据主键 ID 查询记录
     *
     * @param id
     * @return
     */
    @GetMapping("{id}")
    @RestResult
    public Dict getById(Long id) {
        return dictServiceImpl.getById(id);
    }

    /**
     * 无条件获取全部记录
     *
     * @return
     */
    @GetMapping("list")
    @RestResult
    public List<Dict> list() {
        List<Dict> dicts = dictServiceImpl.list();
        return dicts;
    }

    /**
     * 根据条件获取全部记录
     *
     * @param enabled
     * @param content
     * @param orderByColumn
     * @return
     */
    @GetMapping("listByConditions")
    @RestResult
    public List<Dict> listByConditions(boolean enabled, String content, String orderByColumn) {
        return dictServiceImpl.list(
            new QueryWrapper<Dict>()
                .eq("enabled", enabled)
                .likeRight("code", content)
                .orderByDesc(orderByColumn)
        );
    }

    /**
     * 分页查询
     *
     * @param current 当前页
     * @param size    每页显示条数
     * @return
     */
    @GetMapping("page")
    @RestResult
    public List<Dict> page(int current, int size) {
        Page<Dict> page = new Page<>(current, size);
        IPage<Dict> dictPage = dictServiceImpl.page(page, new QueryWrapper<>());
        log.info("总条数: " + dictPage.getTotal());
        log.info("当前页数: " + dictPage.getCurrent());
        log.info("当前每页显示数: " + dictPage.getSize());
        log.info("当前分页总页数: " + dictPage.getPages());
        return dictPage.getRecords();
    }

    // ==========
    // === 改 ===
    // ==========

    @PutMapping
    @RestResult
    public boolean update(Dict dict) {
        return dictServiceImpl.updateById(dict);
    }

    /**
     * @return
     */
    @PutMapping("updateSpecifyColumn")
    @RestResult
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public boolean updateSpecifyColumn() throws InterruptedException {
        Dict dict = new Dict();
        dict.setRemark("生效哟哟哟");
        boolean b1 = dictServiceImpl.update(dict, new QueryWrapper<Dict>().eq("enabled", true));

        dict.setRemark("失效哟哟哟");
        boolean b2 = dictServiceImpl.update(dict, new QueryWrapper<Dict>().eq("enabled", false));
        return b1 && b2;
    }

}
