import java.util.Scanner;
public class EmployeeTax
{
public static void tax(String name, int income) 
{
double tax;
if (income <= 250000)
tax = 0;
else if (income <= 500000)
tax = (income - 250000) * 0.1;
else if (income <= 1000000)
tax = 30000 + ((income - 500000) * 0.2);
else
tax = 50000 + ((income - 1000000) * 0.3);
System.out.println("Name: " + name);
System.out.println("Income Tax: " + tax);
}
public static void main(String args[]) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter name: ");
String name = in.next();
System.out.print("Enter annual income: ");
int income = in.nextInt();
tax(name,income);
}
}