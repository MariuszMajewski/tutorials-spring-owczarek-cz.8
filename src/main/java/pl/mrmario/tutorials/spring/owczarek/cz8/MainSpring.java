package pl.mrmario.tutorials.spring.owczarek.cz8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		String someString= context.getBean("someString", String.class);
		
		System.out.println(someString);
	}

}
