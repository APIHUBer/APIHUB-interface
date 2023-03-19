package com.example.apihubinterface.aop;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;

/**
 * 调用次数切面
 * @author jayingyoung
 */
@RestControllerAdvice
public class InvokeCountAOP {

//	@Resource
//	private UserInterfaceInfoServiceImpl userInterfaceInfoServiceImpl;

	// 定义切面触发的时机—（什么时候执行方法） controller接口的方法执行成功后，执行下述方法
//	public void doInvokeCount(){
		// 调用方法

		// 调用成功后 次数+1
//	}
}
