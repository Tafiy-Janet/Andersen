package lesson_2;

public class SecondTask {
    public static void main(String[] args) {
        numberPosOrNeg(0);
    }

    public static void numberPosOrNeg(int a) {
        if (a < 0) {
            System.out.println(a + " is negative");
        }
        System.out.println(a + " is positive");
    }

}
