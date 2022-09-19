package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class AdditionalTask {
    public static void main(String[] args) {

        //Get the array range.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array range:");

        //Set the array range.
        int size = scanner.nextInt();
        int[] array = new int[size];

        //Get and set the elements of the array.
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //Get and set the slides amount.
        int slides = 0;
        System.out.println("Enter the slides amount:");
        slides = scanner.nextInt();

        //Set initial array.
        System.out.println("Array at the start: " + Arrays.toString(array));

        //Simplify amount of the slides.
        boolean isNegative = slides < 0;
        if (abs(slides) > size || isNegative) {
            slides = slides % size;
        }
        System.out.println("Slides after simplification: " + slides);

        //Set sliding function.
        int performedOperations = 0;
        int initSlide = -1;
        while (performedOperations != size) {
            int currentSlide = -1;
            initSlide++;
            int nextVal = array[initSlide];
            int currentVal;

            //Prescribe steps of different scenarios, both positive and negative.
            while (initSlide != currentSlide) {
                int i = 0;
                currentVal = nextVal;
                if (currentSlide == -1) {
                    i = initSlide + slides;
                } else {
                    i = currentSlide + slides;
                }
                if (i >= size) {
                    i = i - size;
                }
                if (i < 0) {
                    i = size + i;
                }
                currentSlide = i;
                nextVal = array[i];
                array[i] = currentVal;
                performedOperations += 1;
            }
        }
        //Get final result.
        System.out.println("Array at the end: " + Arrays.toString(array));
    }

}
