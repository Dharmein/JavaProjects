import java.util.*;
public class pattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
char e;
System.out.println("Enter the number of columns");
a=sc.nextInt();
System.out.println("Enter the number of rows");
b=sc.nextInt();
System.out.println("Enter the alphabet you want to display");
e=sc.next().charAt(0);
for(c=1;c<=a;c++)
{
for(d=1;d<=b;d++)
{
System.out.print(e);
}
System.out.println();
}
}
}