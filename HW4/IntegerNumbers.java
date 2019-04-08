
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 public class IntegerNumbers {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 int a;
 int b;
 int c;
 
  
  System.out.println ("enter numbers");
  a = Integer.parseInt(br.readLine());
  b = Integer.parseInt(br.readLine());
  c = Integer.parseInt(br.readLine());
  
 
  
 System.out.println("The largest number is " + max(a, b, c));
 System.out.println("The smallest number is " + min(a, b, c));
  }

	public static int max(int a, int b, int c) {

	    int max = a;

	    if (b > max)
	        max = b;
	    if (c > max)
	        max = c;

	     return max;
	}
	
	public static int min(int a, int b, int c) {

	    int min = a;

	    if (b < min)
	        min = b;
	    if (c < min)
	        min = c;

	     return min;
	}
}
 



