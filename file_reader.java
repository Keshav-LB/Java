package java_IO_Stream;
import java.io.*;
public class file_reader 	
{

	public static void main(String[] args) 	
	{
		try(FileInputStream f = new FileInputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\Test.txt");)
		{
			byte []b = new byte[f.available()];
			
			f.read(b);
			//f.close();
			
			String s = new String(b);
			System.out.println(s);
			
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		

	}

}
