package com.atguigu.cxf.helloworld;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	public String sayHello(String name, int age);
}