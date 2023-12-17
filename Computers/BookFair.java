import java.util.*;
public class BookFair
{
String Bname;
Double price;
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the book");
Bname=sc.next();
System.out.println("Enter the price of the book");
price=sc.nextDouble();
}
public void calculate()
{
if (price<=1000)
price=price-price*2/100;
else if (price<=3000)
price=price-price*10/100;
else if (price>3000)
price=price-price*15/100;
}
public void display()
{
System.out.println("The book name: "+Bname);
System.out.println("The price of the book: "+price);
}
public static void main(String args[])
{
BookFair obj=new BookFair();
obj.input();
obj.calculate();
obj.display();
}    
}