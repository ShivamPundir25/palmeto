package configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloWorld getName() {
		return new HelloWorld();
	}
	@Bean
	public Employee getString() {
		return new Employee("SPSPSSPPSPPSP");
	}

}