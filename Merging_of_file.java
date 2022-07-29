package java_IO_Stream;
import java.io.*;
import java.util.*;
public class Merging_of_file {

	public static void main(String[] args)		throws Exception 
	{
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\Test.txt");
		FileInputStream fi1 = new FileInputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\copyingfile.txt");
		
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\SequencemergingofFile.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fi,fi1);
		
		int x;
		while((x=sis.read())!=-1)
		{
			fo.write(x);
		}
		
		/*System.out.println(sis.available());
		byte b[] = new byte[sis.available()];
		sis.read(b);
		String s = new String(b);
		System.out.println(s);*/
		int y;
		while((y=sis.read())!=-1)
		{
			System.out.print((char)y);
		}
		
		
		
		
		

	}

}
