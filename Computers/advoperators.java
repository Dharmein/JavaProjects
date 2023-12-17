import java.util.*;
public class advoperators
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter the number of days back the book was to be returned");
a=sc.nextInt();
if(a=='5')
{
System.out.println("The fine for your book is 4 rupees");
}
else if(a<=10)
{
System.out.println("The fine for the book is 10 rupees");
}
else if(a<5)
{
System.out.println("There is no fine for your book");
}

else
System.out.println("the fine for you book is 20 rupees");




}
}