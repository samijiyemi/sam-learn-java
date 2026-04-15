public class CountEven {

    public static int countEven(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] digits = { 2, 4, 6, 8 };
        System.out.println(countEven(digits));
    }
}