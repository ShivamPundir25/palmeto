
public class UserMainCode
{ public static int checkUnique(String s)
 {
	 String size="";
	 int n=0;
	
	 for(int i=0;i<s.length();i++)
	 {
		// int count=0;
		 int count=0;
		
		 for(int j=0;j<s.length();j++)
		 { 
			 
			 if(i==j)
			 {continue;}
		     if(s.charAt(i)==s.charAt(j))
			 {
				count=1;
				break;
			 }	
		 }
		 if(count==0) {size=size+s.charAt(i);}
	 }
	 n=size.length();
	 return n;
 }
 
 
}
