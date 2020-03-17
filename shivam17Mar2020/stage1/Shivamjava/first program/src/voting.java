
public class voting {

	
public void testAge(int age) throws InsufficientAgeException, InvalidAgeException
{
	if(age>=0 && age<=18)
		throw new InsufficientAgeException();
	else if(age<0|| age>=100)
		throw new  InvalidAgeException();
		else 
			System.out.println("Eligble for voting");}
}
