import java.util.*;
public class scanner5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int b;
int h;
int t;

System.out.println("Enter the base of the triangle");
b=sc.nextInt();
System.out.println("Enter the height of the triangle");
h=sc.nextInt();
System.out.println("Enter the third side of the triangle");
t=sc.nextInt();
double a=0.5*b*h;
int p=b+h+t;

System.out.println("Area : "+a);
System.out.print("Perimeter : "+p);

}
}