import java.util.*;
public class advpatterns4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
char e;
System.out.println("Enter the alphabet \'s\' for a square pattern and Enter the alphabet \'t\' for a triangle pattern");
e=sc.next().charAt(0);
if(e=='s')
{
for(a=1;a<=5;a++)
{
for(b=9;b>=1;b=b-2)
{
System.out.print(b);
}
System.out.println();
}
}
else if(e=='t')
{
for(c=1;c<=9;c=c+2)
{
for(d=9;d>=c;d=d-2)
{
System.out.print(d);
}
System.out.println();
}
}
else
System.out.println("Incorect input from the user");
}
}
