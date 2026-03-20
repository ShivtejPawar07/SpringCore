package com.springcore.ref;

import org.springframework.context.*;
import org.springframework.context.support.*;


public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a1=(A)context.getBean("aref");
		
		System.out.println(a1.getX());
		
		System.out.println(a1.getObj().getY());
	}

}
