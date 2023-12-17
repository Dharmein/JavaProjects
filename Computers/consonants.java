import java.util.Scanner;
public class consonants
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch[]=new char[10];
int k1=0,k2=0;
System.out.println("Enter 10 characters");
for(int i=0;i<10;i++)
{
ch[i]=sc.next().charAt(0);
if(Character.isLowerCase(ch[i]))
k1++;
if(Character.isDigit(ch[i]))
k2++;
}
System.out.println("The number of lower case letters in the array  are: "+k1);
System.out.println("The number of digits in the array are: "+k2);
}
}