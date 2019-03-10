package lesson1;

import java.util.Scanner;

public class HowAreYou {
    public static void main (String[]Args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.next();
        System.out.println("You are " + answer);
    }
}