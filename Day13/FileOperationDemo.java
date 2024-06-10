import java.io.*;

class FileOperationDemo
{
     public static void main(String arg [])
     {
         try
         {
	File f=new File("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt");
	if(f.createNewFile())
	{
		System.out.println("File Created Successfully..!");
	}
	else{
		System.out.println("File Already Exists..!");
	}

// Write into File
	
FileOutputStream ft=new FileOutputStream("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt"); 

	String str= "Hello..! i'm From Java";
	byte b[]=str.getBytes();
	ft.write(b);
	ft.close();
	System.out.println("File Write Successfully..!");

// Read From File

FileInputStream fin=new FileInputStream("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt");

	int i;
	while((i=fin.read())!=-1)
	{
		System.out.print((char)i);
	}
// Modification in Existing File

 ft=new FileOutputStream("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt");
	String s="Hello..! I'm Modified Content";
	b=s.getBytes();
	ft.write(b);
	ft.close();
	System.out.println("\n File Modified Successfully..!");


}
catch(IOException i)
{
	System.out.println("Exception Handled..!");
}
}
}


		