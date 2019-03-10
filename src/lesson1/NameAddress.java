package lesson1;

import java.util.Scanner;

public class NameAddress {

    public static void main (String[] Args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Where are you live, " + name +"?");
        String address = sc.next();
        System.out.println(name + " lives in " + address);
    }
}
