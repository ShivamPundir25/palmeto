import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Size of array");
  int size=sc.nextInt();
  
  for(int i=0;i<size;i++)
  { 
	  System.out.println("Enter element in array");
	   arr[i]=sc.nextInt();
  }
  
  
  System.out.println("Enter the number to be searched");
  int number=sc.nextInt();
  
  System.out.println(UserMainCode4.findElement(arr,number));
  
	}

}
