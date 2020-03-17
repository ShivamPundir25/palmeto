import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		//method 1
		
		//ApplicationContext context=new FileSystemXmlApplicationContext("d://beans.xml");
		//method 2
		
		ClassPathResource factory=new ClassPathResource("bean.xml");
		XmlBeanFactory context= new XmlBeanFactory(factory);
		//method 3
		
		HelloWorld obj=(HelloWorld) context.getBean("helloworld");
		obj.getMessage();
		obj.display();
		Emps1 e=(Emps1) context.getBean("emp");
		e.showEmployee();
	}

}
