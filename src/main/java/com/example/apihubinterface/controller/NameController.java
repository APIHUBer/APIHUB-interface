package com.example.apihubinterface.controller;

import com.example.apihubclientsdk.model.User;
import com.example.apihubclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Name API
 * @author jayingyoung
 */

@RestController
@RequestMapping("/name")
public class NameController {

	@GetMapping("/get")
	public String getNameByGet(String name, HttpServletRequest request){
		System.out.println(request.getHeader("yupi"));
		return "Get Your name is " + name;
	}

	@PostMapping("/post")
	public String getNameByPost(@RequestParam String name){
		return "Post Your name is " + name;
	}

	@PostMapping("/user")
	public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
//		String accessKey = request.getHeader("accessKey");
//		String nonce = request.getHeader("nonce");
//		String timestamp = request.getHeader("timestamp");
//		String sign = request.getHeader("sign");
//		String body = request.getHeader("body");
//
//		// todo: The actual situation should be checked in the database
//		if(!accessKey.equals("yupi")){
//			throw new RuntimeException("no permission");
//		}
//
//		if(Long.parseLong(nonce) > 10000){
//			throw new RuntimeException("no permission");
//		}

//		todo: timestamp cannot more than 5 mins
//		if(timestamp > 10000){
//			throw new RuntimeException("");
//		}

//		todo: The actual situation should be check secretKey in database
//		String serverSign = SignUtils.genSign(body, "abcdefgh");
//		if(!sign.equals(serverSign)){
//			throw new RuntimeException("no permission");
//		}
//
		String result =  "Post Your name is " + user.getUsername();

		// After invoke successfully, Total number of invoke + 1


		return result;
	}
}
