import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("enter the strength of students");
int size=sc.nextInt();
for(int i=0;i<size;i++)
{
	int rollno=sc.nextInt();
	int marks=sc.nextInt();
	tm.put(rollno,marks);
	}

Set keys= tm.keySet();
Iterator itr=keys.iterator();
int[] arr=new int[size];
int j=0;
while(itr.hasNext())
{
	int rollno=(int) itr.next();
	int marks1=tm.get(rollno);
	
	while(size!=0) {
	arr[j]=marks1;
	//sorted.arr[];
	j=j+1;
	size=size-1;}
	}
	}

}
