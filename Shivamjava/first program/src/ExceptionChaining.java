
public class ExceptionChaining {

	public static void main(String[] args) {
	Test t=new Test();	
		// TODO Auto-generated method stub
	try {
t.f2();
	
	}
	finally {
		
	}
	}
}

class Test{
	public int f1(){
		int a=10,b=0;
		int c=a/b;
		return c;
	}
	public void f2()
	{
		int z=f1();
	}
}
