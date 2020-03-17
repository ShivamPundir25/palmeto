
public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
try {
int c=a/b;
System.out.println("in try block"+c);

}
catch(ArithmeticException e)
{
	System.out.println(" error");
	}
catch(StringIndexOutOfBoundsException e)
{
	System.out.println(" jgrjrr");}
finally {
	System.out.println("in final");
}
	}

}
