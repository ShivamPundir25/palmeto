

  class MyThread extends Thread{
	 @Override
	 public void run()
	 {
		 System.out.println("Thread execution begins...");
		 for(int i =1;i<=100;i++)
			 System.out.println(i);
		 System.out.println("End of thrread execution");
	 }
 }
public class ThreadEXample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread t=new MyThread();
System.out.println("MAin method statst");
t.start();
for(int j=2000;j<2100;j++)
	System.out.println(j);
System.out.println("Main method is executed completely");

	}

}