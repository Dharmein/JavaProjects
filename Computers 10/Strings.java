import java.util.*;
public class Strings
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
String a,e,f="";
int b,c,d;
System.out.println("Enter your full name");
a=sc.nextLine();
a=' '+a;
b=a.lastIndexOf(' ');
e=a.substring(b);
for(c=0;c<b;c++)
{
if(a.charAt(c)==' ')
{
d=c+1;
f=f+a.charAt(c+1)+". ";
}
}
f=f+e;
System.out.println(f);
}
}