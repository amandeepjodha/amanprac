package javaprac;
import java.util.*;
public class table {
public static void main(String args[])
{
Scanner kb= new Scanner(System.in);
System.out.println("enter the number you want to calculate the table");
int a =kb.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(a+" * "+i+" "+"="+" "+(a*i));
}
}
}
