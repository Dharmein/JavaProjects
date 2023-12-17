import java.util.*;
public class advrevision3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e,f,g,h;
System.out.println("Enterthe following numbers to print numbers \n1.1-10 \n2.11-20 \n3.21-30 \n4.31-40 \n5.41-50");
a=sc.nextInt();
switch(a)
{
case 1:
for(b=1;b<=10;b++)
{
System.out.println(b);
}
break;
case 2:
for(c=11;c<=20;c++)
{
System.out.println(c);
}
break;
case 3:
for(d=21;d<=30;d++)
{
System.out.println(d);
}
break;
case 4:
for(e=31;e<=40;e++)
{
System.out.println(e);
}
break;
case 5:
for(f=41;f<=50;f++)
{
System.out.println(f);
}
break;
}
}
}