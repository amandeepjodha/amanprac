package javaprac;
import java.util.*;
public class assigmentques2 {
public static void main(String args[])
{
	System.out.println("enter the three number");
	Scanner kb= new Scanner(System.in);
	System.out.println("enter the first number");
	System.out.println("enter the second number");
	System.out.println("enter the third number");
	int a= kb.nextInt();
	int b=kb.nextInt();
	int c= kb.nextInt();
	if(a>b && a>c)
	{
		System.out.println("first is biggest ");
	}
	else if(b>a && b>c)
	{
		System.out.println("second is biggest");
		
	}
	else
	{
		System.out.println("Third is biggest");
	}
	if(a<b && a<c)
	{
		System.out.println("first is smallest ");
	}
	else if(b<a && b<c)
	{
		System.out.println("second is smallest");
		
	}
	else
	{
		System.out.println("third is smallest");
	}
		
}
}
