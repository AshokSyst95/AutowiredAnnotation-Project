package com.vidvaan.human.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.human.bean.Human;				

public class Body {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Human human=context.getBean("human", Human.class);
		human.show();
	}
}
