package lesson_7;

import java.util.List;
import java.util.stream.Stream;

public class ArrayHelper {
    public static <T> List<T> toList(Stream<T> inputStream) {
        return (List<T>) List.of(inputStream.toArray());
    }
}
