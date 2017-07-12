package com.example.demo;

import com.example.bean.AppUser;
import com.example.Application;
import com.example.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class ApplicationMybatisTests {

	@Autowired(required=true)
	private UserMapper userMapper;


	@Test
	@Transactional
	@Rollback
	public void findByUserId() throws Exception {
		AppUser user = userMapper.findByUserId("2");
		Assert.assertEquals("0200", user.getUserKind());
	}
 
}