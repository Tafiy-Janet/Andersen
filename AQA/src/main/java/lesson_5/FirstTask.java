package lesson_5;


import java.util.*;

public class FirstTask {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you want to enter one- or two-dimensional array? Type number 1 or 2.");
        int dimArray = scanner.nextInt();
        if (dimArray == 1) {
            Integer[] oneDimArray = generateOneDimArray();
            swapElements(oneDimArray);
        } else if (dimArray == 2) {
            Integer[][] twoDimArray = generateTwoDimArray();
            swapElements(twoDimArray);
        } else {
            System.out.println("Wrong number. Please try again.");
        }
    }

    public static void swapElements(Integer[] array) {
        System.out.println("Array before change:" + Arrays.asList(array));
        System.out.println("Enter indexes of two elements which you want to change: ");
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        System.out.println("Array after change:" + Arrays.asList(array));
    }

    public static void swapElements(Integer[][] array){
        System.out.println("Array before change:");
        printArray(array);
        System.out.println("Enter indexes of first element (x,y) which you want to change:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter indexes of second element (x,y) which you want to change:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int temp = array[y1][x1];
        array[y1][x1] = array[y2][x2];
        array[y2][x2] = temp;
        printArray(array);
    }
    public static Integer[] generateOneDimArray() {
        System.out.println("How many elements will be in array?");
        int n = scanner.nextInt();
        Random random = new Random();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(50);
        }
        return array;
    }

    public static Integer[][] generateTwoDimArray() {
        System.out.println("Enter the width of array:");
        int x = scanner.nextInt();
        System.out.println("Enter the height of array:");
        int y = scanner.nextInt();
        Integer[][] array = new Integer[x][y];
        Random random = new Random();
        for (int k = 0; k < array.length; k++) {
            for (int l = 0; l < array[0].length; l++) {
                array[k][l] = random.nextInt(50);
            }
        }
      return array;
    }

    public static void printArray(Integer[][] array) {
        for (Integer[] row : array) {
            for (Integer h : row) {
                System.out.print(h);
                System.out.print("\t");
            }
            System.out.println();
        }
    }


}
