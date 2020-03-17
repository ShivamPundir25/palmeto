import java.util.*;

public class StringTokeneizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ArrayList ar=new ArrayList();
System.out.println("Enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	ar.add(sc.next());
	}
System.out.println(ar);
Iterator itr=ar.iterator();
int total,max=0; String name2=null;
while(itr.hasNext())
{
	String temp= (String) itr.next();
	
StringTokenizer stk=new StringTokenizer(temp, "-");
/*int a=stk.countTokens();
System.out.println(a);
 to count total number of counts*/

String name=stk.nextToken();
int a=Integer.parseInt(stk.nextToken());
int b=Integer.parseInt(stk.nextToken());
int c=Integer.parseInt(stk.nextToken());
total=a+b+c;
if(total>=max)
{max=total;
name2=name;
	}
	}
System.out.println("tooper " +name2 +" " +max);
	}

}
