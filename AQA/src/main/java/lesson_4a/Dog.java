package lesson_4a;

public class Dog extends Animal {
    protected static int count;

    public Dog(String name) {
        super(name);
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
        count++;
    }

    public static void getCount() {
        System.out.println("Dogs count: " + count);
    }
}
