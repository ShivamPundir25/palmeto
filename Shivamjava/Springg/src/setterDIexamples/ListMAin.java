package setterDIexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("arraySetterBean.xml");
		ListSetters obj=(ListSetters)ac.getBean("answers");
		obj.showData();
		
	}

}
