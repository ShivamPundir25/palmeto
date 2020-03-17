import java.util.*;
public class StringTokenizer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s=sc.nextLine();
s=s.toUpperCase();
StringTokenizer st= new StringTokenizer(s," ");
int n=st.countTokens();

 String output="";
for(int i=0;i<n;i++)
{String temp=st.nextToken();
char temp2=temp.charAt(temp.length()-1);
output=output+temp2+"$";
}

System.out.println(output.substring(0,output.length()-1));
	}}
