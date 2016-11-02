package org.digitalmirko.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		// Car Insurance instance
//		Insurance status = new carInsurance();
		
		// Bike Insurance instance
//		Insurance status = new bikeInsurance();
		
//		Insurance status = new carInsurance();
//		System.out.println(status.showStatus());
		
		//Application Context interface
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
		Insurance status = context.getBean("myInsurance", Insurance.class);
		System.out.println(status.showStatus());
		context.close();
		
	}

}

