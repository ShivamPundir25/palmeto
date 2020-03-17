import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String epass=sc.next();
		String regex="^((PRO)|(FIN)|(Test))[A-Za-z]{4}[0-9]{3}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(epass);
		boolean b=m.matches();
		System.out.println(b);
	}

}
/*
 * PROxxxxddd
 * FINxxxxddd
 * Testxxxxddd
 * 
 * x-any chacrter d-any digit
 */
 