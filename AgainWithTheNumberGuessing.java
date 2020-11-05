// Straxinja Labus on 05/2020 
import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessing
{

	public static void main(String[] args){
	
	Random r = new Random();	
	int secret = 1+r.nextInt(10);
	int guess;
	int tries = 0;
	Scanner scan = new Scanner(System.in);

	System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
	
	
	do{
	System.out.print(secret + " Your guess: ");
	guess = scan.nextInt();	
	if(secret == guess){System.out.println("That's right! You are a good guesser.");}
	else{
 	System.out.println("That is incorrect. Guess again.");}
	tries++;
	}while(secret != guess);

	
	System.out.println("It only took you " + tries + " tries.");
	}

}

