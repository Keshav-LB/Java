package java_IO_Stream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class Buffered_Stream {

	public static void main(String[] args) 		throws Exception
	{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\Test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}
		

	}

}
