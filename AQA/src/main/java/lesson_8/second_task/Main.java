package lesson_8.second_task;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("0954625367", "Stepanchenko");
        phonebook.add("0665552244", "Stepanchenko");
        phonebook.add("0635487596", "Klopotenko");
        phonebook.add("0558554785", "Gavryshenko");
        List<String> phone = phonebook.get("Stepanchenko");
    }
}
