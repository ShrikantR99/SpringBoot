package com.Spring.example4.SpringProject4;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main(String[] args)
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Trainer tr = (Trainer)ctx.getBean("train1");
        System.out.println(tr);
        
        Trainer tr2 = (Trainer)ctx.getBean("train2");
        System.out.println(tr2);
        
        KodNestClasses kc = (KodNestClasses)ctx.getBean("kodclass");
        System.out.println(kc);
    }
}
