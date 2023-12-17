import java.util.*;
public class Switchcase1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x,y;
char z;
System.out.println("Enter a number");
x=sc.nextInt();
System.out.println("Enter another number");
y=sc.nextInt();
System.out.println("Enter \'a\' for addition of the numbers Enter \'b\' for subtarction the numbers Enter \'c\' for multiplication of the numbers Enter \'d\' for division of the numbers ");
z=sc.next().charAt(0);
int e=x+y;
int f=x-y;
int g=x*y;
int h=x/y;
switch(z)
{
case 'a':
System.out.println(e);
break;
case 'b':
System.out.println(f);
break;
case 'c':
System.out.println(g);
break;
case 'd':
System.out.println(h);
break;
default:
System.out.println("Wrong input");
}

}

}