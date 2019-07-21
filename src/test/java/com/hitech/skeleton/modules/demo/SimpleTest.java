package com.hitech.skeleton.modules.demo;

import com.hitech.skeleton.modules.demo.entity.po.Person;
import com.hitech.skeleton.modules.demo.mapper.PersonMapper;
import com.hitech.skeleton.modules.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

	@Autowired
	private PersonMapper personMapper;

	@Autowired
	private UserMapper userMapper;


	/**
	 * 构造的实例并没有设置 id
	 */
	@Test
	public void insert() {
		Person person = new Person();
		person.setName("Steven");
		person.setCreateTime(LocalDateTime.now());
		person.setManagerId(1088248166370832385L);
		person.setEmail("zhoulin2@asiainfo.com");
		person.setAge(37);


		int insert = personMapper.insert(person);
		System.out.println("影响记录数: " + insert);
	}

}
