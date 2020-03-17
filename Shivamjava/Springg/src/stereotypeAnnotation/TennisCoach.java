package stereotypeAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// implicitly it will create bean in camel case 
//in this case it will create a bean name of tennisCoach
public class TennisCoach {
	
	@Autowired
	//from spring 5 , if we do not write autowired annotation then
	//spring container(ioc-inverse of conversion) will implicitly call it 
	private FortuneService fs;
	public TennisCoach(FortuneService fs) {
		this.fs=fs;
	}
	public String getDailyWorkOut() {
		return "Do Work Out Daily For Success...";
	}

	public String getFortune() {
		return fs.getMessage();
	}
}
