import java.util.Arrays;

public class AvgInArrays {
    public static void main(String[] args) {
        // int[] numbers = { 1, 2, 3, 4, 5 };
        // int sum = 0;
        // for (int i = 0; i < numbers.length; i++) {
        // sum += numbers[i];

        // }
        // System.out.println(sum / numbers.length);

        double[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += (1 / numbers[i]);
        }
        System.out.println(Arrays.toString(numbers) + "'s Harmonic Average is " + sum);
        // for 8 => answer = 761/280 = 2.71785714286
        // for 7 => answer = 361/140 = 2.57857142857
        // for 3 => answer = 11/6 = 1.83333...
        // for 2 => answer = 3/2 = 1.5
        // for 1 => answer = 1/1 = 1
    }
}