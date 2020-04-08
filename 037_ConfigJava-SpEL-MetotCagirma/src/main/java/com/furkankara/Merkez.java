package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext appCtx =new  ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Yazar yazar = appCtx.getBean("yazarBean",Yazar.class);
		
		System.out.println(yazar);
		
		System.out.println(yazar.getBilgi());
		
	
		
		
		
	}

}
