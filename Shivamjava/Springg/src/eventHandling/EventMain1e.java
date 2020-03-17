package eventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventMain1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ConfigurableApplicationContext ct=new
    ClassPathXmlApplicationContext("eventHandlingBean1.xml");
    
    ct.start();
    
    TestBean obj=(TestBean)ct.getBean("testBean");
    obj.displayDetails();
    ct.refresh();
    ct.stop();
    ct.refresh();
    
	}

}
