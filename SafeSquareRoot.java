// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class SafeSquareRoot
{

	public static void main(String[] args){
	
	System.out.println("SQUARE ROOT!");
	Scanner scan = new Scanner(System.in);
	int num;
	System.out.print("Enter a number: ");
	num = scan.nextInt();

	while(num < 0){
		System.out.println("You can't take the square root of a negative number. silly.");
		System.out.print("Try again: ");
		num = scan.nextInt();
	}
	
	System.out.println("The square root of " + num + " is " + Math.sqrt(num) + ".");
 }

}

