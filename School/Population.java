import java.util.Scanner;
public class Population
{
double p;
double r;
public Population(double a, double b)
{
p = a;
r = b;
}
public void print() 
{
int q;
for (int y = 2001; y <= 2007; y++) 
{
p = p * (1 + r / 100);
q=(int) p;
System.out.println("Population in " + y + ": " + q);
}
}
public static void main(String args[]) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter population in the year 2000: ");
double a = in.nextInt();
System.out.print("Enter growth rate: ");
double b = in.nextInt();
Population obj = new Population(a,b);
obj.print();
}
}
