package lesson_8.first_task;


import lesson_8.AppData;

import java.util.*;


public class Counter {
    public void setWordsCount() {
        AppData appData = new AppData("first_task/words.csv", ";");
        List<String> wildAnimals = twoDArrayToList(appData.getData());
        System.out.println("Header: " + String.join(",", appData.getHeaders()) + "\nUnique words:");
        Set<String> unique = new HashSet<>(wildAnimals);
        unique.forEach(System.out::println);

        System.out.println("\nTotal number of each word:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : wildAnimals) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
    }

    public <T> List<T> twoDArrayToList(T[][] twoDArray) {
        List<T> list = new ArrayList<>();
        for (T[] array : twoDArray) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }
}
