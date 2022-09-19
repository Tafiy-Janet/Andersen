package lesson_2;

public class EighthTask {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
        for (int[] arrays : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(arrays[j] + " ");
            }
            System.out.println();
        }
    }
}
