package IOstreams;
import java.util.*;
import java.io.*;

public class IOExample5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
try(FileOutputStream fos=new FileOutputStream("D:\\Shivamjava\\first program\\bin\\IOstreams\\dataobjectfile.txt");
BufferedOutputStream bos=new BufferedOutputStream(fos);
DataOutputStream out=new DataOutputStream(bos);)
{
//write first employee data
out.writeInt(1);
out.writeUTF("Shivam");
out.writeDouble(5000000.00);
//write first employee data
out.writeInt(2);
out.writeUTF("partap");
out.writeDouble(700000.00);

//write first employee data
out.writeInt(3);
out.writeUTF("Singh");
out.writeDouble(900000.00);
System.out.println("Objects return to file...");

}
	}

}
