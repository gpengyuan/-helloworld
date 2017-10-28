package com.atguigu.cxf.helloworld;

import javax.jws.WebService;

//@WebService(endpointInterface="com.atguigu.cxf.helloworld.HelloWorld",serviceName="helloworld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String name, int age) {

		return "Hello, " + name + "(" + age + " years old)";
	}

}
