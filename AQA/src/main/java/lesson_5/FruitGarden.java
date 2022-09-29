package lesson_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FruitGarden<T extends Fruit> {
    private Supplier<T> supplier;

    FruitGarden(Supplier<T> supplier) {
        this.supplier = supplier;
    }
    public List<T> getFruits(int count) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            T fruit = this.supplier.get();
            list.add(fruit);
        }
        return list;
    }



}
