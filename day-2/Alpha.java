import java.util.Scanner;
class Alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:");
char ch=sc.next().charAt(0);
if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
{
System.out.println(ch + " is an alphabet");
}
else
{
System.out.println(ch + " is an not alphabet");
}
}
}