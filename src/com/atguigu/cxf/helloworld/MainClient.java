package com.atguigu.cxf.helloworld;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class MainClient {
	public static void main(String[] args) {

		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		//jaxWsProxyFactoryBean.setAddress("http://192.168.14.25:8888/helloworld");
		jaxWsProxyFactoryBean.setAddress("http://localhost:9999/helloworld");
		//jaxWsProxyFactoryBean.setAddress("http://localhost:8080/helloworld/helloworld");
		// jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);
		HelloWorld helloWorld = jaxWsProxyFactoryBean.create(HelloWorld.class);
		String hello = helloWorld.sayHello("wang", 25);
		
		System.out.println("访问成功！");
		System.out.println(hello);

	}
}
