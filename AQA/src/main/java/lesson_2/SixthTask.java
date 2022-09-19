package lesson_2;

import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        System.out.println(Arrays.toString(array));
    }

}
