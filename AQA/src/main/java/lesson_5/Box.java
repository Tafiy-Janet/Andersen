package lesson_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list = new ArrayList<T>();

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public void addFruit(Collection<T> fruits) {
        list.addAll(fruits);
    }

    public void addFruit(T[] fruits) {
        list.addAll(List.of(fruits));
    }

    public float getWeight() {
        float sum = 0f;
        for (T fruit : list) {
            sum += fruit.getWeight();
        }
        System.out.println("Weight of box: " + sum);
        return sum;
    }

    public boolean compare(Box<?> box) {
        boolean isEqual = this.getWeight() == box.getWeight();
        System.out.println(isEqual ? "Boxes are equal" : "Boxes are not equal");
        return isEqual;
    }

    public void transferFruits(Box<T> box) {
        list.forEach(box::addFruit);
        box.getWeight();
        System.out.println("Count of fruits in the box after transfer: " + box.list.size());
        this.list.clear();
    }

}
