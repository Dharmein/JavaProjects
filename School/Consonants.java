import java.util.Scanner;
public class Consonants
{
public static void display(String str)
{
str = str.toUpperCase();
int l = str.length();
for (int i = 0; i < l; i++) 
{
char ch = str.charAt(i);
if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') 
System.out.println(str.charAt(i));
}
}
public static void main(String args[]) 
{ 
Scanner in = new Scanner(System.in);
System.out.print("Enter string: ");
String str = in.nextLine();
display(str);
}
}