import java.util.*;
public class scanner2
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int r;

System.out.println("Enter the radius of the circle");
r=sc.nextInt();

double a=3.14*r*r ;
System.out.println("The are of the circle is "+a);

}
}