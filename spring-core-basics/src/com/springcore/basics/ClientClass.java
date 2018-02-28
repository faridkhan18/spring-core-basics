package com.springcore.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ClientClass {

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle tri = (Triangle) bf.getBean("triangle");
		tri.draw();
		System.out.println("Yolo");
		

	}

}
