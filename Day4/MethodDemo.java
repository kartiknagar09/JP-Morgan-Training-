class MethodDemo
{
     MethodDemo(int a, int b)
   {
	System.out.println(a+" "+b);
  }

  MethodDemo(int a, int b, int c)
 { 
	System.out.println(a+" "+b+ " "+c);
 }
public static void main(String arg[])
{
    MethodDemo md=new MethodDemo(10,20);
    MethodDemo md1=new MethodDemo(30,40,50);
	
  }
}