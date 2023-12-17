import java.util.*;
public class Switchcase3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,d,e,f,g;
char b;
System.out.println("Enter a number");
a=sc.nextDouble();
System.out.println("Enter \'S\' for square root\nEnter \'s\' for square value\nEnter \'C\' for cube root\nEnter \'c\' for cube value ");
b=sc.next().charAt(0);
d=Math.sqrt(a);
e=Math.pow(a,2);
f=Math.cbrt(a);
g=Math.pow(a,3);
switch(b)
{
case 'S':
System.out.println(d);
break;
case 's':
System.out.println(e);
break;
case 'C':
System.out.println(f);
break;
case 'c':
System.out.println(g);
break;
default :
System.out.println("Invalid input");
}
}
}