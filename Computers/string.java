import java.util.*;
public class string 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
char c;
int len;
int k1=0,k2=0;
System.out.println("Enter a string");
s=sc.nextLine();
len=s.length();
for(int i=0;i<len;i++)
{
c=s.charAt(i);
if((int)c<=90&&(int)c>=65)
k1++;
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
k2++;
}
System.out.println("The number of upper case letters in the string are "+k1);
System.out.println("The number of vowels in the string are "+k2);
}
}