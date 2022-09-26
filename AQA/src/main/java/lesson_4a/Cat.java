package lesson_4a;

public class Cat extends Animal {
    protected static int count;

    public Cat(String name) {
        super(name);
        this.maxRunDistance = 200;
        this.maxSwimDistance = 0;
        count++;
    }

    public static void getCount() {
        System.out.println("Cats count: " + count);
    }


}
