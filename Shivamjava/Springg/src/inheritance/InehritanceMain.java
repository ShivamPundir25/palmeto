package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InehritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext c=new ClassPathXmlApplicationContext("inheritanceBean.xml");
		//SingleInheritance obj=(SingleInheritance)c.getBean("BaseObject");
		// if u use base bean the u will get only base fields
		SingleInheritance obj=(SingleInheritance)c.getBean("ChildObject");
	
		obj.display();
		
		
	}

}
