package com.atguigu.cxf.helloworld;

import javax.xml.ws.Endpoint;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MainServer2 {
	public static void main(String[] args) {

		HelloWorld helloWorld = new HelloWorldImpl();
		
		String address = "http://localhost:9999/helloworld";
		Endpoint.publish(address , helloWorld);
		
//		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
//		jaxWsServerFactoryBean.setAddress("http://localhost:9999/helloworld");
//		jaxWsServerFactoryBean.setServiceClass(HelloWorldImpl.class);
//		Server server = jaxWsServerFactoryBean.create();
//		server.start();
		System.out.println("启动成功！");

	}
}
