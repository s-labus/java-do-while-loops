// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class CollatzSequence
{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	int n;

	System.out.print("Starting number: ");	
	n = scan.nextInt();
	System.out.print(n + "	");
	while(n != 1){
		if(n % 2 == 0){n = n/2;}else  if(n % 2 != 0){ n = n*3+1;}
		System.out.print(n + "	");
	try{Thread.sleep(1000);}catch(Exception e){};
	}

	System.out.println();
	System.out.println("Tigar zvani Bann");
 }
}
