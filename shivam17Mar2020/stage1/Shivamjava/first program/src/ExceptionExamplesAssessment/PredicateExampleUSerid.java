package ExceptionExamplesAssessment;
import java.util.function.Predicate;
public class PredicateExampleUSerid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User("admin","1234");
		User user2=new User("pravenn","3725");
Predicate<User> tuser=u -> u.uid.equals("admin") && u.pwd.equals("1234");
//if(tuser.test(user2))
	 if(tuser.test(user1))
	System.out.println("Valid username");
else
	System.out.println("INvalid username");
	}

}

class User{
	String uid;
	String pwd;
	public User(String uid ,String pwd)
	{
		super();
		this.uid=uid;
		this.pwd=pwd;
		
	}
}
