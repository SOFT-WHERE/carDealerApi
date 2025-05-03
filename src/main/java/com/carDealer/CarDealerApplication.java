package com.carDealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

// @SpringBootApplication
public class CarDealerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(CarDealerApplication.class, args);

		// ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.carDealer");
		Scanner sc=new Scanner(System.in);
		
		while(1!=0){
			System.out.println("choose your car:\n1 family car \n2 sports car \n3 cybertruck car");
		int choose=sc.nextInt();
		String beanId="";

		switch (choose) {
			case 1:
				beanId="family";
				break;
			case 2:
				beanId="sports";
				break;
			case 3:
				beanId="cybertruck";
				break;
			default:
				break;
		}

		Car car=(Car) context.getBean(beanId);
		car.showDetails();
		}
		

	}

}
