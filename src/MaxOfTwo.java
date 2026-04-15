public class MaxOfTwo {

    public static int maxOfTwo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int maximium = maxOfTwo(100, 50);
        System.out.println(maximium);
    }
}