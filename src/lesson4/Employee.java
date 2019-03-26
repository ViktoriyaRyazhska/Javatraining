package lesson4;

import java.util.Scanner;

public class Employee {

    private String name;
    private int depnum;
    private double salary;
    public Appl appl = new Appl();

    public Employee(String name, int depnum, double salary) {
        this.name = name;
        this.depnum = depnum;
        this.salary = salary;
    }

    public void department () {
        Appl appl = new Appl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department number");
        int indepnnum = sc.nextInt();

        for (int i = 0; i < ; i++) {
            if (appl.[i] == indepnnum) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] Args) {

    }
}