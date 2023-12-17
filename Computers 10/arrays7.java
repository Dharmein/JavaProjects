import java.util.*;
public class arrays7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
for(int b=0;b<5;b++)
{
String f[]=new String[5];
int c=0,d=0,e;
int a[]=new int[3];
System.out.println("Enter your Name");
f[b]=sc.next();
for(e=0;e<3;e++)
{
System.out.println("Enter your score ");
a[e]=sc.nextInt();
c=c+a[e];
}
d=c/3;
System.out.println("The average score of "+f[b]+" is "+d);
}
}
}