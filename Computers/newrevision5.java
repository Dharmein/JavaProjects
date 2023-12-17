


import java.util.*;
public class newrevision5
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the first number");
a=sc.nextInt();
System.out.println("Enter the second number");
b=sc.nextInt();
System.out.println("Enter \n1 to add \n2 to subtract \n3 to multiply \n4 to divide");
c=sc.nextInt();
switch(c)
{
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a/b);
break;
}
}
}