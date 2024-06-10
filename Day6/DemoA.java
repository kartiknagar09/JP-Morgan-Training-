class  DemoA
{
    final int a=10;
System.out.println(a);
final void show()
{
     System.out.println("Hello A");
}
}
class B extends DemoA
{
   void show()
{
     System.out.println("Hello B");
}
public static void main(String arg[])
{
     B b=new B();
	b.show();
}
}
}