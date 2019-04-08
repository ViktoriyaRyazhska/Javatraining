import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumbMethod {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double a;
		double b;
		double c;

		System.out.println("enter numbers");
		a = Double.parseDouble(br.readLine());
		b = Double.parseDouble(br.readLine());
		c = Double.parseDouble(br.readLine());

		System.out.println(getRange(a) && getRange(b) && getRange(c));
	}

	public static boolean getRange(double f) {
		return (-5 <= f) && (f <= 5);
	}

}

	
