package java_IO_Stream;
import java.io.*;
public class file_output_stream {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		 try(FileOutputStream fos=new FileOutputStream("C:\\Users\\KESHAV MISHRA\\MyJava\\Test.txt");)
	        {
	        
	        String str="Hello this is keshav mishra and i'am mastering java.";
	        
	        
	        
	        fos.write(str.getBytes());
	        fos.close();
	        
	        }
	        
	        
	        
	     catch(FileNotFoundException e)
	        {
	            System.out.println(e);
	        }
	         
	        catch(IOException e)
	        {
	            System.out.println(e);
	        }
	}

}
