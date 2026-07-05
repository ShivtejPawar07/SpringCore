package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[]x) {
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("test.xml");
		Object obj=con.getBean("e");
		Employee e=(Employee)obj;
	//	System.out.println(e.getId()+e.getName()+e.getSal());
		e.show();
		con.close();
	}

}
