package ExceptionExamplesAssessment;
class MyThread extends Thread
{
public	void run()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println("Hello");
			try {
				sleep(0);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	}
public class RunnableExample {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
MyThread t=new MyThread();
t.start();
//t.join();
t.yield();
for(int j=101;j<=201;j++)
{
	System.out.println("in main mehtod");}
	}

}
