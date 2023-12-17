import java.util.Scanner;
public class Palindrome
{
public static void Palin() 
{ 
Scanner in = new Scanner(System.in);
System.out.println("Enter the string: ");
String s = in.next();
s= s.toUpperCase();
int l= s.length();
int k=0;
for (int i = 0; i <  l / 2; i++) 
{
if (s.charAt(i) == s.charAt(l - 1 - i)) 
k++;
}
if (k>0)
System.out.println("It is a palindrome string.");
else
System.out.println("It is not a palindrome string.");
}
}