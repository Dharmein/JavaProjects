import java.util.*;
public class arrays6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[9];
String f[]=new String[9];
int b,c=0,d=0,e=0,g;
for(b=0;b<9;b++)
{
System.out.println("Enter your Name");
f[b]=sc.next();
System.out.println("Enter your marks");
a[b]=sc.nextInt();
d=d+a[b];
if(a[b]>c)
{
c=a[b];
e=b;
}
}
g=d/9;
System.out.println("The average marks are: "+g);
System.out.println("The topper of the class is "+f[e]+" with "+c+" marks");
}
}