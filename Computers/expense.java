import java.util.*;
public class expense
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2,s;
int v=0,len;
char ch;
System.out.println("Enter the first name ");
s1=sc.next();
System.out.println("Enter the last name");
s2=sc.next();
s=s1+" "+s2;
len=s.length();
for(int i=0;i<len;i++)
{
ch=s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
v++;
}
System.out.println("The employee name "+s+" has "+v+" vowels");
}
}