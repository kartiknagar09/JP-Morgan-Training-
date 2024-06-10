class Copydemo
{	
	int a;
	String b;
	Copydemo()
	{
		a=1;
		b="abc";
	System.out.println(a+" "+b);
	}	
	Copydemo(Copydemo ref)
	{
		a=ref.a;
		b=ref.b;
	System.out.println(a+" "+b);
	}
public static void main(String arg[])
{
	Copydemo cp=new Copydemo();
	Copydemo cp2=new Copydemo(cp);
  }
}
