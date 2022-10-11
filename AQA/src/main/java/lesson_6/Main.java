package lesson_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of array:");
        int width = scanner.nextInt();
        System.out.println("Enter the height of array:");
        int height = scanner.nextInt();
        System.out.println("Include incorrect values? Type true or false");
        boolean isIncorrect = !scanner.nextBoolean();
        String[][] arr = ArrayHelper.generateArray(width, height, isIncorrect);
        try {
            ArrayHelper.sumElements(arr);
        } catch (ExceptionHelper.MyArrayDataException | ExceptionHelper.MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
