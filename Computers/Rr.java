import java.util.Scanner;
public class Rr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a[]=new String[10];
char ch;
System.out.println("Enter 10 names");
for(int i=0;i<10;i++)
a[i]=sc.next();
System.out.println("All the names which start with R are: ");
for(int i=0;i<10;i++)
{
ch=a[i].charAt(0);
if (ch=='R'||ch=='r')
System.out.println(a[i]);
}
}
}