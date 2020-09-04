
/*
Name: Samuel Zhang 
CptS 233:MicroAssignment #1
Date: 9/4/2020
gitRepo url: https://github.com/SamZhang9120/HomeWork-1
 */
import java.util.Scanner;
 

public class RoomMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int tryAgain = 1;
		do {
			
			System.out.println("Enter the length of Rectangle:");
			double length = scanner.nextDouble();
			System.out.println("Enter the width of Rectangle:");
			double width = scanner.nextDouble();
	    	System.out.println("Enter the cost of carpet per square foot:");
	    	double CostPer = scanner.nextDouble();
	    	RoomCarpet a = new RoomCarpet(length,width,CostPer);

	    	System.out.println(a.DimensionString());

	    	System.out.println("The cost with these Dimensions will be " + a.getTotalCost() + "$");
	  
	    	
	    	System.out.println();
	    	System.out.println("press 1 to continue try again or anything else to end the program");
	    	tryAgain =  scanner.nextInt();
		
		}	while (tryAgain == 1);
	}

	
}

