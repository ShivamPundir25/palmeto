import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String epass=sc.next();
//String regex = "[0-9]+[@#$]+";
String regex="(?=.*[0-9])(?=.*[$#@])(?=.*[a-z]).{6,20}";
Pattern p=Pattern.compile(regex);
Matcher m=p.matcher(epass);
boolean b=m.matches();
System.out.println(b);
	}

}
/*
 -must contain at least one digit
 -must ontain atleast @,#,$
 -length should be between 6-20 chracters
 */
