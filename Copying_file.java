package java_IO_Stream;
import java.util.*;
import java.io.*;

public class Copying_file {

	public static void main(String[] args) 	throws Exception
	{
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\Test.txt");
		FileOutputStream fo = new FileOutputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\copyingfile.txt");
		FileInputStream fi1 = new FileInputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\copyingfile.txt");
		//byte b[] = new byte[fi.available()];
		//fi.read(b);
		
		/*String s = new String(b);
		System.out.println(s);*/
		
		int x;
		while((x=fi.read())!=-1)
		{
			if(x>=65 && x<=90)
				fo.write(x+32);
			else
				fo.write(x);
		}
		
		byte c[] = new byte[fi1.available()];
		fi1.read(c);
		String s = new String(c);
		System.out.println(s);
		

	}

}
