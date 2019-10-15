package com.hitech.skeleton.modules.demo;

import com.hitech.skeleton.modules.demo.entity.po.Dict;
import com.hitech.skeleton.modules.demo.entity.po.Menu;
import com.hitech.skeleton.modules.demo.mapper.DictMapper;
import com.hitech.skeleton.modules.demo.mapper.MenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

	@Autowired
	private DictMapper dictMapper;

	/**
	 * 构造的实例并没有设置 id
	 */
	@Test
	public void test() {


		LocalDateTime localDateTime = LocalDateTime.parse("2019-10-10", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(localDateTime.toString());
	}

}
