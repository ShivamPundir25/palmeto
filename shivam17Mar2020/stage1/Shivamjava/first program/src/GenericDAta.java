
public class GenericDAta {
	
	A a;
	B b;
	
	
	public void 
	{
		a=obj1;
		b=obj2;
	}
	
	public void display()
	{
		System.out.println(a+" ,"+b);
	}
	public A reta()
	{ return(a);}
	public A retb()
	{ return(b);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GenericDAta<Integer> obj=new GenericDAta<Integer>(11,33);
int x=(int)obj.reta();
int y=(int)obj.retb();
int z=x+y;
System.out.println("Adittion is:" +z);
GenericDAta<String> obj1=new GenericDAta<String>("Hloo","World");
obj1.display();
	}

}
