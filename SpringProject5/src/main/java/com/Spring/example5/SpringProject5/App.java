package com.Spring.example5.SpringProject5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Person p = (Person)ctx.getBean("per");
        System.out.println(p);
       
	}

}
