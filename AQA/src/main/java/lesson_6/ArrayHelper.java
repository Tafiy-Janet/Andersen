package lesson_6;

import java.util.Random;

public class ArrayHelper {

    public static String[][] generateArray(int x, int y, boolean correct) {
        String[][] array = new String[x][y];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (correct || random.nextBoolean()) {
                    int a = random.nextInt(10);
                    array[i][j] = Integer.toString(a);
                } else {
                    array[i][j] = "e";
                }
            }
        }
        if (!correct)
            printArray(array);
        return array;
    }

    public static void sumElements(String[][] array) throws ExceptionHelper.MyArraySizeException, ExceptionHelper.MyArrayDataException {
        int sum = 0;
        int[][] newArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ExceptionHelper.MyArraySizeException();
            }
            for (int j = 0; j < array[0].length; j++) {
                if (array.length != 4) {
                    throw new ExceptionHelper.MyArraySizeException();
                }
                try {
                    newArray[i][j] = Integer.parseInt(array[i][j]);
                    sum += newArray[i][j];
                } catch (Exception e) {
                    throw new ExceptionHelper.MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        printArray(array);

        System.out.println("Sum is: " + sum);

    }

    public static void printArray(String[][] array) {
        for (String[] row : array) {
            for (String i : row) {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }


}
