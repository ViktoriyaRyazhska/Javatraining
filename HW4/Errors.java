import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Errors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number;
		
		System.out.println("Enter number of error");
		number = Integer.parseInt(br.readLine());
        
        ErrorNumb e= ErrorNumb.WRONG;
        switch (number) {
		case 400:
			e = ErrorNumb.BADREQUEST;
			break;
		case 401:
			e = ErrorNumb.UNAUTHORIZED;
			break;
		case 403:
			e = ErrorNumb.FORBIDDEN;
			break;

		case 404:
			e = ErrorNumb.NOTFOUND;
			break;
			
		case 405:
			e = ErrorNumb.METHODNOTALLOWED;
			break;
			
			
		default:
			break;
		}
        System.out.println(e.getNumber() + ": " + e);
}

}
	
