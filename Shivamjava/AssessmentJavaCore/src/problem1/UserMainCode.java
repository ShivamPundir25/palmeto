package problem1;

import java.util.ArrayList;

public class UserMainCode{
/*public static int compareDashes(String s1,String s2)
{ 
	int l=2;
	///char ch='-';
	for(int i=0;i<s1.length();i++)
	{
	if(s1.charAt(i)=='-')
	 {
		for(int j=0;j<=i;j++)
		 {
			if((s2.charAt(j)=='-')&&(i!=j))
			{
				break;
			}
			else if((s2.charAt(j)=='-')&&(i==j))
			{
				l=1;
				continue;
			}
		
		 }
	 }
		//return l;
	}
	
	
	return l;
}}
	*/
	public static int compareDashes(String s1,String s2) {
		int flag;
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='-')
			{
				ar1.add(i);
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='-')
			{
				ar2.add(i);
			}
		}
		if (ar1.equals(ar2))
		{
			flag=1;
		}
		else flag=2;
		return flag;}
	}