package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext  cont= new ClassPathXmlApplicationContext("demoBean.xml");
		MainClass1 obj =(MainClass1)cont.getBean("details");
		obj.displayDetails();
	}

}
