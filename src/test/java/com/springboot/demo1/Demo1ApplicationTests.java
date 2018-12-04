package com.springboot.demo1;

import com.springboot.demo1.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

	@Autowired
	Person person;

	@Test
	public void contextLoads() {
		System.out.println("上传到Git的测试代码2.0");
		System.out.println(person);
	}

}
