import java.util.*;
public class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1="",s2="";
System.out.println("Enter a string");
s1=sc.next();
s1=s1.toLowerCase();
int len=s1.length();
len--;
for(int i=len;i>=0;i--)
s2=s2+(s1.charAt(i));
if (s1.equals(s2))
System.out.println("The string is a palindrome");
else
System.out.println("The string is not a palindrome");
}
}