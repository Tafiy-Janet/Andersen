package lesson_6;

public class ExceptionHelper extends Exception {
    static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("Size of array must be 4x4.");
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(int i, int j, Object value) {
            super("Error at (" + i + ", " + j + ")\n" + "Value = " + value.toString());
        }
    }
}
