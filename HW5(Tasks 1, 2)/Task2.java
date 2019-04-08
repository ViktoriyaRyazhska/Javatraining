

import java.io.IOException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int product = 1;
		
		System.out.println ("Enter 10 numbers");
		int[] numbers = new int[10];
		
			
		
		for (int i = 0; i < 5; i++) {
	
			numbers[i] = Integer.parseInt(sc.nextLine());
		
		}
			for (int i = 0; i < numbers.length; i++) {
		  if(numbers[i] > 0) {
			
				  sum += numbers[i];
				  
		  }
		 
			
		  
		  
		  }
				  System.out.println("Sum of first 5 elements: " + sum);
		
			
			  for (int i = 5; i < numbers.length; i++) {
			
			  
			
					  product = product * numbers[i];
					  
					  
				  }
			  System.out.println(product);
			  }
                
}	  




