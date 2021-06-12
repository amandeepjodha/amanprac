package javaprac;
import java.util.*;
public class pattern1 {
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the rows");
		int a =kb.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		}
	
	}

