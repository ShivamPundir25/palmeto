package IOstreams;
import java.util.*;
import java.io.*;

public class IoExample3 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
char ch;
int x;
		try(FileReader fin=new FileReader("D:\\Shivamjava\\first program\\bin\\IOstreams\\FileReader1.txt");
		FileWriter fout=new FileWriter("D:\\Shivamjava\\first program\\bin\\IOstreams\\FileReader2.txt");)
{
	x=fin.read();
	while(x!=-1)
	{
		ch=(char)x;
		fout.write(ch);
    System.out.print(ch);

    //if we use println then it will go to next line by default
    x=fin.read();
	}
	}
}

}
// reading writing using file reader