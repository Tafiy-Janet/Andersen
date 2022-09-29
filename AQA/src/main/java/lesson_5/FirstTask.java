package lesson_5;



public class FirstTask {
    public static void main(String args[]) {
        Integer[] array = {1, 2, 3, 4, 5};
        int a = array[3];
        array[3] = array[1];
        array[1] = a;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
