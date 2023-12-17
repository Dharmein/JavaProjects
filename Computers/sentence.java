import java.util.*;
public class sentence
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s,word;
char ch;
int k1=0,k2=0,len;
System.out.println("Enter a sentence");
s=" "+sc.nextLine();
len=s.length();
for(int i=0;i<len;i++)
{
ch=s.charAt(i);
if(Character.isWhitespace(ch))
k1++;
else if(Character.isLetter(ch))
k2++;
}
System.out.println("The number of words in the sentence is: "+k1);
System.out.println("The number of letters in the sentence is: "+k2);
}
}