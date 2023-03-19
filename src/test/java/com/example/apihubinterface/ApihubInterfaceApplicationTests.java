package com.example.apihubinterface;

import com.example.apihubclientsdk.client.APIHUBClient;
import com.example.apihubclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApihubInterfaceApplicationTests {

	@Resource
	private APIHUBClient apihubClient;

	@Test
	void contextLoads() {
		String result = apihubClient.getNameByGet("zanyuan123");
		User user = new User();
		user.setUsername("yangzanyuan");
		String usernameByPost = apihubClient.getUsernameByPost(user);
		System.out.println(result);
		System.out.println(usernameByPost);
	}

}
