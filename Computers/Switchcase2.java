import java.util.*;
public class Switchcase2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Idli\t\t\t    50");
System.out.println("Rice\t\t\t    100");
System.out.println("Chinese\t\t\t 180");
System.out.println("Pasta\t\t\t   250");
System.out.println("Enter the number of the dish you want to order");
a=sc.nextInt();
switch(a)
{
case 1:
System.out.println("You order Idli has been placed that would cost 50 rupees ");
break;
case 2:
System.out.println("You order Rice has been placed that would cost 100 rupees ");
break;
case 3:
System.out.println("You order Chinese has been placed that would cost 180 rupees ");
break;
case 4:
System.out.println("You order Pasta has been placed that would cost 250 rupees ");
break;
default:
System.out.println("False order please try again ");
break;
}
}
}