package com.hitech.skeleton.modules.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hitech.skeleton.modules.demo.entity.po.Person;
import com.hitech.skeleton.modules.demo.entity.po.User;
import com.hitech.skeleton.modules.demo.mapper.PersonMapper;
import com.hitech.skeleton.modules.demo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

	@Autowired
	private PersonMapper personMapper;

	@Autowired
	private UserMapper userMapper;

	//@Test
	public void select() {
		List<Person> personList = personMapper.selectList(null);
		personList.forEach(System.out::println);
		Assert.assertEquals(5, personList.size());
	}

	//@Test
	public void insert() {
		Person person = new Person();
		person.setEmail("123@qq.com");
		person.setAge(37);
		person.setCreateTime(LocalDateTime.now());
		person.setManagerId(1088248166370832385L);
		person.setName("刘明强");
		int rows = personMapper.insert(person);
		System.out.println("影响记录数: " + rows);
	}

	/**
	 * Lambda 表达式，这是 MP 最出彩的部分，应重点掌握！
	 * SQL: SELECT id, name, age, email, manager_id, create_time FROM user WHERE name LIKE '%雨%' AND (age < 40 OR email IS NOT NULL)
	 */
	public void selectLambda() {
		LambdaQueryWrapper<User> lambdaQueryWrapper = Wrappers.lambdaQuery();
		lambdaQueryWrapper.like(User::getUsername, "雨")
			.and(lqw -> lqw.lt(User::getId, 40).or().isNotNull(User::getUsername));
		List<User> users = userMapper.selectList(lambdaQueryWrapper);
		users.forEach(System.out::println);
	}

}
