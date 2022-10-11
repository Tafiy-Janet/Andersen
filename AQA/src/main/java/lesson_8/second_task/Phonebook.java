package lesson_8.second_task;

import java.util.*;

public class Phonebook {

    protected Map<String, String> phonebook = new HashMap<>();


    public void add(String number, String surname) {
        phonebook.put(number, surname);
    }


    public List<String> get(String surname) {
        List<String> result = new ArrayList<>();
        for (var phone : phonebook.entrySet()) {
            if (phone.getValue().trim().equalsIgnoreCase(surname.trim())) {
                result.add(phone.getKey());
            }
        }
        return result;
    }

}