import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new
		ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		Employee emp=new Employee();
     
		emp.setName("surya");
		emp.setDesg("secretPulihora");
        int status=dao.updateEmployee(emp);
		if(status!=0)
		{
			System.out.println("updated");
		}
		
		
		
		
		
		/*
		emp.setName("Swaroop");
        emp.setDept("NOWHERE");
        emp.setDesg("DEVEs");
        emp.setComp("CTS");
        emp.setMobile("38728742");
        emp.setEmail("ghs@dnwjnd");
        int status= dao.saveEmployee(emp);
        System.out.println(status);
        System.out.println("REcord inseted....");
        */
		
		
		
		
		
	}

}
