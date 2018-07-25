package com.sandeeps.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Triangle triangle = new Triangle();
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
		Triangle triangle  = (Triangle)context.getBean("triangle");
		triangle.draw();
		context.close();



	}

}
