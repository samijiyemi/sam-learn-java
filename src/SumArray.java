// SumOfArray: A simple Java program that calculates the total sum of elements
// in an integer array using a loop

public class SumArray {

    public static int sumOfArray(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 45, 98, 87, 24, 28, 18, 16 };
        System.out.println(sumOfArray(numbers));
    }
}