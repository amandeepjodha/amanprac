package javaprac;
import java.util.*;
public class menu {

	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("would you like to order");
		System.out.println("1. YES");
		System.out.println("2. NO");
		
		 int choice = kb.nextInt();
		 switch(choice){
		 case 1:
			 System.out.println("enter the choice");
			 System.out.println("Menu Display");
			 System.out.println("1. Snack");
			 System.out.println("2. Lunch");
			 System.out.println("3. Dinner");
			 System.out.println("4. Soft drink/tea");
			 int choice1 = kb.nextInt();
			 switch (choice1){
				 case 1:
					 System.out.println("1.idli rs 40");
					 System.out.println("2.Dosa rs 50");
					 System.out.println("3.uttampam rs 30");
					 System.out.println("4.poha/Upma rs 20");
					 String order=kb.next();
					 switch (order) {
					 case "idli":
						 System.out.println(" Thank you for choosing idli enter the quantity");
						 int qty=kb.nextInt();
						 int tot= qty*40;
						 System.out.println("your bill is of "+" "+tot);
						 break;
					 case "Dosa":

						 System.out.println(" Thank you for choosing dosa enter the quantity");
						 int qty1=kb.nextInt();
						 int tot1= qty1*50;
						 System.out.println("your bill is of "+" "+tot1);
						 break;
					 case "uttampam":

						 System.out.println(" Thank you for uutapam  enter the quantity");
						 int qty3=kb.nextInt();
						 int tot3= qty3*30;
						 System.out.println("your bill is of "+" "+tot3);
						 break;
					 case "poha":
						 System.out.println(" Thank you for choosing poha enter the quantity");
						 int qty4=kb.nextInt();
						 int tot4= qty4*20;
						 System.out.println("your bill is of "+" "+tot4);
						 break;
						 
					 }
					 break;
				 case 2:
					 System.out.println("lunch is being prepared");
					 break;
				 case 3:
					 System.out.println("dinner is being prepared");
					 break;
				 case 4:
					 System.out.println("Sorry Cold drinks out of stock");
					 break;
			 }
			 
		}
		 
	}

}
