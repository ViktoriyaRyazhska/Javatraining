package lesson1;

import java.util.Scanner;

public class Circle {

    public static void main (String[] Args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter is " + perimeter);
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area is " + area);
    }
}
