import java.util.Scanner;
public class Magicstring
{
public static void magic(String str) 
{
str = str.toUpperCase();
int l = str.length();
int k=0;
for (int i = 0; i < l -1; i++)
{
if (str.charAt(i) + 1 == str.charAt(i + 1)) 
k++;
}
if (k>0)
System.out.println("It is a magic string");
else
System.out.println("It is not a magic string");
} 
public static void main(String args[]) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter word: ");
String str = in.next();
magic(str);
}
}