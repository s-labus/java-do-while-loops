// Straxinja Labus on 05/2020 
import java.util.Random;

public class ShorterDoubleDice
{

	public static void main(String[] args){
	
	System.out.println("HERE COMES THE DICE!");
	
	Random r = new Random();	

	int first;
	int second;
	int total;
	
	do{		
		first = 1+r.nextInt(6);
		second = 1+r.nextInt(6);
		total = first + second;

		System.out.println("Roll #1: " + first);
		System.out.println("Roll #2: " + second);
		System.out.println("The total is " + total + "!");
		
 	 }while(second != first);
	

}

}

