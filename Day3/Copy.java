class Copy
{	
	int a;
	String b;
	Copy(int a,String b)
	{
		this.a=a;
		this.b=b;
	System.out.println(a+" "+b);
	}	
	Copy(Copy ref)
	{
		a=ref.a;
		b=ref.b;
	System.out.println(a+" "+b);
	}
public static void main(String arg[])
{
	Copy cp=new Copy(1,"abc");
	Copy cp2=new Copy(cp);
  }
}
