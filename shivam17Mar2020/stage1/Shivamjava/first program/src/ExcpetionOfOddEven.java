
public class ExcpetionOfOddEven {
// condition class
	public void evenOdd(int num) throws EvenException,OddException
	{
		if(num%2==0)
		{ throw new  EvenException();
			
		}
		else throw new OddException(); 
	}
}
 