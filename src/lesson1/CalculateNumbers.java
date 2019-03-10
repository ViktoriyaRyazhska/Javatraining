package lesson1;

import java.util.Scanner;

public class CalculateNumbers {

    public static void main (String[] Args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter b number");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("a + b = " + c);
        int d = a - b;
        System.out.println("a - b = " +d);
        int e = a * b;
        System.out.println("a * b = " +e);
        int f = a / b;
        System.out.println("a / b = " +f);
    }
}
