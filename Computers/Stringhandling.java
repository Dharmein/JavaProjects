import java.util.*;
public class Stringhandling
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence");
String a=sc.next();
String d=a.trim();
int c=0,e=0;
String f="";
for(int k=1;k>=1;k++)
{
c=d.indexOf(' ');
String b=a.substring(0,c);
if(e<c)
{
e=c;
f=b;
}
d=d.substring(c);
}
System.out.println("The largest word is "+f);
System.out.println("The number of letters in the word is "+e);
}
}