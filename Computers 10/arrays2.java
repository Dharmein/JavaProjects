import java.util.*;
public class arrays2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int b,c,x,y,z=0,w=0;
int e[]=new int[10];
int d[]=new int[10];
int a[]=new int[10];
System.out.println("Enter 10 numbers");
for(b=0;b<10;b++)
a[b]=sc.nextInt();
for(c=0;c<10;c++)
{

if(a[c]%2==0)
{
z++;
d[z]=a[c];
}
else
{
w++;
e[w]=a[c];
}
}
x=d.length;
y=e.length;
System.out.println("Even: ");
for(c=1;c<x;c++)
{
if(d[c]==0)
break;
System.out.println(d[c]);
}
System.out.println("Odd: ");
for(c=1;c<y;c++)
{
if(d[c]==0)
break;
System.out.println(e[c]);
}
}
}