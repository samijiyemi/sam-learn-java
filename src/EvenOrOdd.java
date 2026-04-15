public class EvenOrOdd {

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }

    public static void main(String[] args) {
        String isEvenOrOdd = evenOrOdd(10);
        System.out.println(isEvenOrOdd);
    }
}