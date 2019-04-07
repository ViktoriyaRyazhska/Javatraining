import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws  NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println ("Enter 5 words sentence");
		String s = br.readLine();
		
		int length = s.length();
		
		String[] words = s.split(" ");
		 int index = 0;
	        for(int i = 0; i < words.length; ++i){
	            final String current = words[i];
	            if(current.length() > words[index].length()){
	                index = i;
	                System.out.println("Longest word: " + words[index]);
	            }
	        
	        }

		     for(int i = 1; i <= 1; i++) {
		        String temp = new StringBuilder(words[1]).reverse().toString();
		        System.out.println("Reversed 2-nd word: " + temp + " ");
		 
		}
		    char[] charArray = new char[length];
		    for(int i = 1; i <= 1; i++) {
           charArray[1] = s.charAt(1);
       
           System.out.println("Leangth of the 2-nd word: " + words[1].length());  
        } 
		    
		
		
	}

}
