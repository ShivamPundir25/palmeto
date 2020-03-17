
public class UserMainCode {
 public static int countVowels(String s)
 { int count=0;
 for(int i=0;i<s.length();i++)
 {
	 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='O'||s.charAt(i)=='I'||s.charAt(i)=='U' )
	 {
		 count=count+1;
	 }
 }
	 return 0;
 }
}
