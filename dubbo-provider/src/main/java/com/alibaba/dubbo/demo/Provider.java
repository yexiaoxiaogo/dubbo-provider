package com.alibaba.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "META-INF/spring/dubbo-demo-provider.xml" });
		context.start();
		System.in.read(); // press any key to exit
	}
}
