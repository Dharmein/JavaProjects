import java.util.*;
public class advrevision6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e;
System.out.println("Enter the number of rows");
a=sc.nextInt();
System.out.println("Enter the number of columns");
b=sc.nextInt();
for(c=1;c<=a;c++)
{
for(d=1;d<=b;d++)
{
if(d%2==0)
{
System.out.print("X");
}
if(d%2==1)
{
System.out.print("O");
}
}
System.out.println();
}
}
}