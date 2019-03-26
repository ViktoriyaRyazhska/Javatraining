package lesson2;

public class Employee {

    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    public Employee (){
    }

    public Employee (String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee (String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += salary();
    }

    private double salary () {
        return rate * hours;
    }

    public String toString (String name, double rate, double hours) {
        return "Name: " + name + "Rate: " + rate + "Hours: " + hours;
    }

    public void changeRate (double rate) {
        this.setRate(rate);
    }

    private void setRate(double rate) {
        this.rate = rate;
    }

    public double bonuses () {
        return this.salary() * 0.1;
    }
}
