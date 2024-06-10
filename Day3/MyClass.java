class MyClass 
{
    MyClass()
   {
	this(100);
	//System.out.println("Hello I am Default");
        }
MyClass(int b)
{
   // this();
  System.out.println("Hello i am perameterized:"+b);
}
public static void main(String arg[])
{
    MyClass obj=new MyClass();
	}
} 