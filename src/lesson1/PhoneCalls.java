package lesson1;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PhoneCalls {

    public static void main (String[] Args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c1, c2, c3");
        double c1 = sc.nextDouble(), c2 = sc.nextDouble(), c3 = sc.nextDouble();
        System.out.println("Enter t1, t2, t3");
        double t1 = sc.nextDouble(), t2 = sc.nextDouble(), t3 = sc.nextDouble();
        double a = c1 * t1;
        double b = c2 * t2;
        double c = c3 * t3;
        System.out.println("Call 1 price is " + a);
        System.out.println("Call 2 price is " + b);
        System.out.println("Call 3 price is " + c);
        double sum = a + b + c;
        System.out.println("Talk price is " + sum);



    }
}
