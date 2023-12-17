import java .util.*;
public class practise
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 20 character word");
String a=sc.next();
a=a.toUpperCase();
int k=0,g=0;
char c;
for (int i=0;i<20;i++)
{
c=a.charAt(i);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
k++;
else
g++;
}
System.out.println("The number of Vowels are "+k);
System.out.println("The number of Consonants are "+g);
}
}