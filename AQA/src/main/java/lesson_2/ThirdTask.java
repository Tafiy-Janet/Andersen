package lesson_2;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println(isNumberNegative(-7));
    }

    public static boolean isNumberNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

}
