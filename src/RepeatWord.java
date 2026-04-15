public class RepeatWord {

    public static String repeatString(String word, int count) {
        if (count == 0) {
            return "";
        } else {
            String result = "";

            for (int i = 0; i < count; i++) {
                result += word;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(repeatString("hello", 2));
    }
}