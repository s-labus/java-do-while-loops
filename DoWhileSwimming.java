// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class DoWhileSwimming
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	String swimmer1 = "GALLANT";
	String swimmer2 = "GOOFUS";

	double minimumTemp = 79.0; //Fahrenheit
	double currentTemp;
	double savedTemp;
	int swimTime;

	System.out.print("What is the current water temperature? ");
	currentTemp = scan.nextDouble();
	savedTemp = currentTemp;	// saves a copy of this value so we can get it back later

	System.out.println("\nOkay, so the current water temperature is " + currentTemp + "F.");
	System.out.println(swimmer1 + " approaches the lake...");

	swimTime = 0;
	while(currentTemp >= minimumTemp){
		System.out.print("\t" + swimmer1 + " swims for a bit.");
		swimTime++;
		System.out.println(" Swim time: " + swimTime + " min.");
		try{Thread.sleep(600);}catch(Exception e){} // pauses for 600 ms
		currentTemp -= 0.5; // subtract 1/2 degree from water temp
		System.out.println("\tThe current water temperature is now " + currentTemp + "F.");
	}

	System.out.println(swimmer1 + " stops swimming. Total swim time: " + swimTime + " min.");
	
	currentTemp = savedTemp; // restores original water temperature
	
	System.out.println("\nOkay, so the current water temperature is " + currentTemp + " F.");
	System.out.println(swimmer2 + " approaches the lake...");

	swimTime = 0;
	
	do{
		System.out.print("\t" + swimmer2 + " swims for a bit.");
		swimTime++;
		System.out.println(" Swim time: " + swimTime + " min.");
		try{Thread.sleep(600);}catch(Exception e){} // pauses for 600 ms
		currentTemp -= 0.5;
		System.out.println("\t The current water temperature is now " + currentTemp + " F.");
	}while(currentTemp >= minimumTemp);

	System.out.println(swimmer2 + " stops swimming. Total swim time: " + swimTime + " min.");
 }
}

