import java.util.*;   //importing scanner class 
public class CalculateHypotenuse   //decleration of class
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);  //initialising scanner class
double b,h,hypot;
System.out.println("Enter the Base of the right angled triangle");
b=sc.nextDouble(); //taking input of base from user
System.out.println("Enter the Height of the right angled triangle");
h=sc.nextDouble(); //taking input of height from user
hypot=Math.sqrt(Math.pow(b,2)+Math.pow(h,2)); //Calculating hypotenuse
System.out.println("The hypotenuse of the right angled triangle is "+hypot);  //displaying hypotenuse
}
}