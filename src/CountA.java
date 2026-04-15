public class CountA {

    public static int countA(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char letterIndex = text.charAt(i);
            if (letterIndex == 'a') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countA("apple and banna is awesome!"));
    }
}