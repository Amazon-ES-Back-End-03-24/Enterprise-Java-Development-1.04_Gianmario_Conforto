public class Main {
    public static void main(String[] args) {

        int[] numbers = {-15, 5, 12, 20, 35};
        int maxnum = 0, minnum = 0;

        System.out.println("Exercise 1");

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] > maxnum)
                maxnum = numbers[i];

            if (numbers[i] < minnum)
                minnum = numbers[i];
        }
        int difference = maxnum - minnum;

        System.out.println("The difference is: " + difference);

        System.out.println("Exercise 2");

        int minnum2 = 0;
       git a
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] < minnum2)
                minnum2 = numbers[i];

            if (numbers[i] > minnum)
                minnum = numbers[i];

            System.out.println("The smallest numbers are: " + minnum + " and " + minnum2);
        }
    }

}
