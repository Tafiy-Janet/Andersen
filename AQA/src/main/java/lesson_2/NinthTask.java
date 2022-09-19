package lesson_2;

import java.util.Arrays;

public class NinthTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray(4, 10)));

    }

    public static int[] getArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

}
