import java.util.*;
public class compare
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2;
System.out.println("Enter two strings");
s1=sc.next();
s2=sc.next();
int len1,len2;
s1=s1.toUpperCase();
s2=s2.toUpperCase();
len1=s1.length();
len2=s2.length();
if(s1.equals(s2))
System.out.println("Both strings are equal");
else 
System.out.println("Both strings are not equal");
if (len1>len2)
System.out.println(s1);
else if(len1<len2)
System.out.println(s2);
else
System.out.println("Both strings are equal in length");
}
}