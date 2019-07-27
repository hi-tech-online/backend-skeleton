package com.hitech.skeleton.modules.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hitech.skeleton.modules.demo.entity.po.Person;
import com.hitech.skeleton.modules.demo.mapper.PersonMapper;
import com.hitech.skeleton.modules.demo.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Steven
 * @since 2019-07-20
 */
@Slf4j
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

	@Autowired
	private PersonMapper personMapper;

	@Override
	public Person getById(Long id) {
		return personMapper.getById(id);
	}

	@Override
	public void addBatch() {

		for (int i = 10; i < 20; i++) {
			Person person = new Person();
			person.setId(1000L + i);
			person.setName(i + " 同志");
			//personMapper.insert(person);
			this.save(person);
		}

		throw new NullPointerException("空指针!");
	}
}
