package lesson_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrayHelper {
    public static <T> List<T> toList(Stream<T> inputStream) {
        return (List<T>) Collections.unmodifiableList(new ArrayList<>(Arrays.asList(inputStream.toArray())));
    }
}
