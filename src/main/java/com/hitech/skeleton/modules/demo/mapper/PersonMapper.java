package com.hitech.skeleton.modules.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hitech.skeleton.modules.demo.entity.po.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Steven
 * @since 2019-07-20
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}
