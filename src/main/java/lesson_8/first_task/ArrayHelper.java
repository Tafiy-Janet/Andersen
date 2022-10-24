package lesson_8.first_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrayHelper {
    public static <T> List<T> twoDArrayToList(T[][] twoDArray) {
        List<T> list = new ArrayList<>();
        for (T[] array : twoDArray) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }
    public static <T> List<T> toList(Stream<T> inputStream) {
        return (List<T>) Collections.unmodifiableList(new ArrayList<>(Arrays.asList(inputStream.toArray())));
    }
}
