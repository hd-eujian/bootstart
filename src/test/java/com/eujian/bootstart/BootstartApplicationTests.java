package com.eujian.bootstart;

import com.bootstart.maven.EujianRedisTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootstartApplicationTests {
	@Autowired
	private EujianRedisTemplate eujianRedisTemplate;

	@Test
	public void contextLoads() {
		eujianRedisTemplate.setString("1","qw");
		String string = eujianRedisTemplate.getString("1");
		System.out.println(string);
	}

}
