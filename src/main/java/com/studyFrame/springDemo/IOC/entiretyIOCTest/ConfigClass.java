package com.studyFrame.springDemo.IOC.entiretyIOCTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

//	@Bean
//	public Person person001(){
//		return new Person();
//	}

//	@Bean
//	public Home home001(){
//		return new Home();
//	}

	@Bean
	public MyJavaBean myJavaBean(){
		return new MyJavaBean();
	}

	@Bean
	public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
		return new MyBeanFactoryPostProcessor();
	}

	@Bean
	public MyBeanPostProcessor myBeanPostProcessor(){
		return new MyBeanPostProcessor();
	}

}
