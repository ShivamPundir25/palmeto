package JavaBasicsAssessment;
import java.util.Scanner;
import java.util.Arrays;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	    int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{ System.out.println("Enter the elements");
			arr[i]=sc.nextInt();
		}
		double sum=0;
		for(int j=0;j<size;j++)
		{
			sum=sum+(Math.pow(arr[j], j));
		}
		System.out.println((int)sum);
	}

}
