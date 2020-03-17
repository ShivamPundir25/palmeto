package IOstreams;
import java.io.*;
public class IoExample1 {
//fileread program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis=new FileInputStream("D:\\Shivamjava\\first program\\src\\IOstreams\\test.txt");
	char ch;
	int i;
	while((i=fis.read())!=-1)
	{
		ch=(char)i;
		System.out.print(ch);
	}
	fis.close();
}
catch(FileNotFoundException fnfe){System.out.println("File does not exist");}
catch(IOException ioe) {System.out.println(ioe);}
	}

}
