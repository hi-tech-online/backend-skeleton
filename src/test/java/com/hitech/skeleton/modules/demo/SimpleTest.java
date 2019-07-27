package com.hitech.skeleton.modules.demo;

import com.hitech.skeleton.modules.demo.entity.po.Menu;
import com.hitech.skeleton.modules.demo.mapper.MenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

	@Autowired
	private MenuMapper menuMapper;

	/**
	 * 构造的实例并没有设置 id
	 */
	@Test
	public void test() {
		Menu menu = menuMapper.selectByText("员工调岗");
		System.out.println("menu: " + menu);
	}

}
