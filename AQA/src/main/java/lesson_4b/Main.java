package lesson_4b;


public class Main {
    public static void main(String args[]) {
        Cat[] array = {
                new Cat("Persik", 20),
                new Cat("Patrick", 40),
                new Cat("Kubik", 30),
                new Cat("Kit", 20)
        };
        Plate plate = new Plate(100);
        for (Cat cat : array) {
            cat.eat(plate);
            plate.info();
            cat.isHungry();
        }
        System.out.println();
        plate.addFood(-1);

    }
}
