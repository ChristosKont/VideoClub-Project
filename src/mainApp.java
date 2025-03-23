import java.util.*;

public class mainApp {

   public static void main (String[] args) {

   	   //Arxikopoihsh  antikeimenwn
	   Scanner sc = new Scanner (System.in);
	   AvailableCat available = new AvailableCat();
	   RentedCat rented = new RentedCat();
	   String answer;

	   //Kuriws programma
	   boolean done = false;
	   while (! done)	{
		   System.out.println("\n===============================================================");
		   System.out.println("0. Episkopisi tainiwn");
		   System.out.println("1. Episkopisi paixnidiwn");
		   System.out.println("2. Episkopisi enoikiasewn");
		   System.out.println("3. Eksodos");
		   System.out.print("> ");
		   answer = sc.nextLine();
		   System.out.println("===============================================================");

		   if (answer.equals("0")) {
		   		available.getMovie();
		   } else if (answer.equals("1")) {
		   		available.getGame();
		   } else if (answer.equals("2")) {
		   		rented.getRentals();
		   } else {
			   	done = true;
		   }

	   } 

   }//main();
   
}