package lesson_2;

public class FourthTaskPlusAsterisk {
    public static void main(String[] args) {
        System.out.println(isYearLeap(2024));
    }

    public static boolean isYearLeap(int a) {
        if (a % 100 == 0) {
            if (a % 400 == 0) {
                return true;
            }
            return false;
        }
        if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}
