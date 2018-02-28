package com.springcore.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class ClientClass {

	public static void main(String[] args) {
		//BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		//Triangle tri = (Triangle) bf.getBean("triangle");
		Triangle tri = (Triangle) ac.getBean("triangle");
		tri.draw();
		System.out.println("Yolo");
		

	}

}
