
 class A{
int z;

A(int x)
{
	z=x;
	}
{
	System.out.println(z);
}	
}
 
 
 class B extends A {
	B()
	{
		super(6);
	}
	 public static void main(String arg)
	 {
		
		new B();
	 }
 }
