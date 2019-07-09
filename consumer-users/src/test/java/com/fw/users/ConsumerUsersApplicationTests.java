package com.fw.users;

import com.fw.users.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerUsersApplicationTests {

	@Autowired
	UsersService usersService;
	@Test
	public void contextLoads() {
		usersService.hello();
	}

}
