import java.util.Scanner;
class DyArr
{
    public static void main(String arg[])
    {
	int size,i;
 Scanner sc=new Scanner(System.in);
System.out.println("Enter Elements of Array:");
size=sc.nextInt();
int a[]=new int [size];
for(i=0;i<size;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("Printed Array Elements:");
for(i=0;i<size;i++)
{
	System.out.println(a[i]+" ");
}
}
}
