package DependencyInjectionCollectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new
ClassPathXmlApplicationContext("mapsBean.xml");

DiMapsPojo obj =(DiMapsPojo)context.getBean("qbmap");

obj.showAnswers();
	}

}
