package lesson_2;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println(isSumCorrect(20, 0));
    }

    public static boolean isSumCorrect(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

}
