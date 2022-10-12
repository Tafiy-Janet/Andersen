package lesson_4a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PetHouse {

    public static void main(String args[]) {

        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new Cat("Suzi"),
                new Dog("Sunny"),
                new Cat("Persik"),
                new Cat("Patrick"),
                new Cat("Tyoma")));
        animals.forEach(animal -> {
            Random random = new Random();
            if (animal.getClass() == Cat.class) {
                animal.swim(0);
                animal.run(random.nextInt(200));
            } else {
                animal.swim(random.nextInt(15));
                animal.run(random.nextInt(600));
            }
        });
        System.out.println();
        Cat.getCount();
        Dog.getCount();
        Animal.getCount();
    }
}
