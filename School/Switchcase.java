import java.util.*;
public class Switchcase
{
public static void main (String args[])
{

    Scanner sc=new Scanner(System.in);
    int b,c,d;
    char a;
System.out.println("Enter the initial of any day of the week");
a=sc.next().charAt(0);
switch (a)
{
case 'm':
System.out.println("Monday \nIt always seems imposible until its done");
break;
case 't':
System.out.println("Tuesday \nSet your goal high and dont stop till you get there");
break;
case 'w':
System.out.println("Wednesday \nWith the new day comes strength and new thoughts");
break;
case 'T':
System.out.println("Thursday \nOnly I can change my life no one can do it for me");
break;
case 'f':
System.out.println("Friday \nStart where you are ,Use what you have ,Do what you can");
break;
case 's':
System.out.println("Saturday \nBe kind whenever possible it is lways possible");
break;
case 'S':
System.out.println("Sunday \nProblems are not stop signs ,they are guide lines");
break;

}
}
}