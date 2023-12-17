import java.util.*;
public class arraystring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s[]=new String[10];
int len;
System.out.println("Enter 10 String");
for(int i=0;i<10;i++)
s[i]=sc.next();
System.out.println("All the Strings with even lengths entered by you are");
for(int i=0;i<10;i++)
{
len=s[i].length();
if(len%2==0)
System.out.println(s[i]);
}
}
}