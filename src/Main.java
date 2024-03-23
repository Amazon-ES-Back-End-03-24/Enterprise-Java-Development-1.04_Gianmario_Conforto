import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();

    }
    private static void exerciseOne() {
        int[] numbers = {-1, 5, 12, -15, 20, 35, -5};
        int maxnum = 0, minnum = 0;
        int difference = 0;

        System.out.println("Exercise 1");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxnum)
                maxnum = numbers[i];

            if (numbers[i] < minnum)
                minnum = numbers[i];

            difference = maxnum - minnum;
        }

        System.out.println("The difference is: " + difference);
    }

    private static void exerciseTwo() {
        int[] numbers = {-1, 5, 12, -15, 20, 35, -5};
        int min1 = numbers[0];
        int min2 = numbers[0];

        System.out.println("Exercise 2");

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] < min1) {
                min2 = min1;
                min1 = numbers[i];
            }

            else if (numbers[i] < min2) {
                min2 = numbers[i];
            }
        }
        System.out.println("The smallest numbers are: " + min1 + " and " +min2);
    }



}
