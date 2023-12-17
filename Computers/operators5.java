import java.util.*;
public class operators5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int f;
char x;
int c;
System.out.println("Enter the side of a square");
f=sc.nextInt();
System.out.println("Type \"a\" for the perimeter and type\"b\" for area");
x=sc.next().charAt(0);
int p=4*f;
int b=f*f;
if(x=='a')
{
System.out.println("Perimeter is "+p);
}
else
System.out.println("Area is "+b);


}
}