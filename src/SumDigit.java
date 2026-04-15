public class SumDigit {

    public static int sumDigit(String text) {
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char letters = text.charAt(i);
            int digits = Character.getNumericValue(letters);
            sum += digits;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit("1290876"));
    }
}