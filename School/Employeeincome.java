import java.util.Scanner;
public class Employeeincome
{
public static void tax(String name,int income)
{
double tax=0;
if(income<250000)
tax=0;
if(250000<=income && income<500000)
tax=(10.0/100.0*(income-250000));
if(500000<=income && income<1000000)
tax=30000+(20.0/100.0*(income-500000));
if(income>=1000000)
tax=50000+(30.0/100.0*(income-1000000));
System.out.println("Name -"+name);
System.out.println("Tax- "+tax);
}
public static void main(String[]args)
{       
Scanner in =new Scanner(System.in);
System.out.println("Enter name");
String name=in.nextLine();
System.out.println("Enter income");
int income=in.nextInt();
tax(name,income);
}
}