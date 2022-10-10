package lesson_8.first_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHelper {
    public static <T> List<T> twoDArrayToList(T[][] twoDArray) {
        List<T> list = new ArrayList<>();
        for (T[] array : twoDArray) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }
}
