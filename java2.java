package javaprac;
import java.util.*;

public class java2 {
	public static void main(String args[])
{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the age of person");
		int age= kb.nextInt();
		if(age>18)
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("you are not eligible for voting");

		}
}
}
