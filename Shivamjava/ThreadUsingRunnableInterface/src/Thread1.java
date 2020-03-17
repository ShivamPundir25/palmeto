import java.util.*;

public abstract class Thread1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	Runnable r=()->{for(int i=1;i<=10;i++)
{System.out.println(i);}};
	Thread t=new Thread(r);
	t.start();
	
}}
