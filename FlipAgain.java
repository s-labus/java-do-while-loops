// Straxinja Labus on 05/2020 
import java.util.Scanner;
import java.util.Random;

public class FlipAgain
{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	Random r = new Random();
	int coin = r.nextInt(2);
	String again;
	String ans;

		do{if(coin == 1){ans ="TAILS";}else{ans="HEADS";}
		System.out.print("You flip a coin and it is... " + ans);
		System.out.println();		
		System.out.print("Would you like to flip again (y/n)?");	
		again = scan.next();}while(again.equals("y"));

	/*while(again.equals("y")){
		if(coin == 1){ans ="TAILS";}else{ans="HEADS";}
		System.out.print("You flip a coin and it is... " + ans);
		System.out.println();
		System.out.print("Would you like to flip again (y/n)?");	
		again = scan.next();
	}*/
 }
}

