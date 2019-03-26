package lesson4;

public class MaxSumNegative {

    public static void main (String[] Args) {
        int numbers[] = {-1,2,3,-4,5,6,-7,8,-9,10};

        int max = numbers[0];
        int imax = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                imax = i;
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println(" is in " + imax + 1 + " place");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum of pisitive numbers = " + sum);

        int amount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {amount++;}
        }
        System.out.println("Amount of negative numbers = " + amount);

    }
}
