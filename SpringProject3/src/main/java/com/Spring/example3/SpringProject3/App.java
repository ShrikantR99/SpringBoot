package com.Spring.example3.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.example3.SpringProject3.Employee;
public class App
{
    public static void main(String[] args)
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Employee e = (Employee)ctx.getBean("emp");
    	
        System.out.println(e);
    }
}
