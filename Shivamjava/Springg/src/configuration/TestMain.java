package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new
	    AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld helloWorld =ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("HeLLo World>>>>>....");
		helloWorld.getMessage();
		helloWorld.showData();
		
		
		Employee emp=ctx.getBean(Employee.class);
		emp.show();
	}

}
