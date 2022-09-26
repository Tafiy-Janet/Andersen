package lesson_4a;

public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected static int count;


    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        System.out.println(name + " run " + Math.min(distance, maxRunDistance) + " m");
    }

    public void swim(int distance) {
        System.out.println(name + " swam " + Math.min(distance, maxSwimDistance) + " m");
    }

    public static void getCount() {
        System.out.println("Animals count: " + count);
    }
}
