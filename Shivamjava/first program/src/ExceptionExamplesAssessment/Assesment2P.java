package ExceptionExamplesAssessment;
import java.util.Scanner;
import java.util.Arrays;
public class Assesment2P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array");
int length= s.nextInt();
int [] array=new int[length];
for(int i=0;i<length;i++)
{
	System.out.println("Enter the element"+i);
	array[i]=s.nextInt();
	}
System.out.println("Enter the index at which u want to access the element");
int index=s.nextInt();
try {
	System.out.println("the array element at index is"+ index +"=" +array[index]);
	System.out.println("The array element successfully accessed");
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}

	}

}
