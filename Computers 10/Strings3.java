import java.util.*;
public class Strings3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a;
char b[]=new char[10];
int c,d;
System.out.println("Enter string");
a=sc.nextLine();
c=a.length();
for(d=0;d<c;d++)
{
b[d]=a.charAt(d);
System.out.println(b[d]);
}
}
}