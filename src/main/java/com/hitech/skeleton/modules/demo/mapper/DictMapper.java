package com.hitech.skeleton.modules.demo.mapper;

import com.hitech.skeleton.modules.demo.entity.po.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据字典类型表 Mapper 接口
 * </p>
 *
 * @author Steven
 * @since 2019-04-28
 */
@Mapper
public interface DictMapper extends BaseMapper<Dict> {

}
