package MapsExample;
import java.util.*;

public class HashMApExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Integer> stats=new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of entries");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{System.out.println("Enter the year:");
int year=sc.nextInt();
System.out.println("Enter the number of admission:");
int noa=sc.nextInt();
stats.put(year, noa);
	}

Set set=stats.entrySet();
Iterator itr=set.iterator();
int max=0;
int temp=0;
int tyear=0;
while(itr.hasNext())
{Map.Entry entry=(Map.Entry)itr.next();
temp=(Integer)entry.getValue();
if(temp>max)
{max=temp;
tyear=(Integer)entry.getKey();
	}
	}
System.out.println("The details of maximum admission are:");
System.out.println("Year:"+tyear+"  "+"Number of admission:"+max);
	}

}
