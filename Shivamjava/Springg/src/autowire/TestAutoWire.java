package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");

EmployeeBean employee=(EmployeeBean)context.getBean("employee");
System.out.println(employee.getFullName());
System.out.println(employee.getDepartmentBean().getName());
	}

}
