import java.util.*;
public class names
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
String name[]=new String[10];
String s1,s2;
int len1,len2;
System.out.println("Enter ten names");
for(int i=0;i<10;i++)
name[i]=sc.next();
len1=name[0].length();
len2=name[0].length();
s1=name[0];
s2=name[0];
for(int i=0;i<10;i++)
{
if(len1>name[i].length())
{
s1=name[i];
len1=name[i].length();
}
if(len2<name[i].length())
{
s2=name[i];
len2=name[i].length();
}
}
System.out.println("Smallest: "+s1);
System.out.println("Largest: "+s2);
}
}