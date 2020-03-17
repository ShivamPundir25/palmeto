import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingMapObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("mapquestion-bean.xml");
		 QuestionUsingMapObject qump=( QuestionUsingMapObject)cont.getBean("qump");
		qump.showAnswers();

	}

}

