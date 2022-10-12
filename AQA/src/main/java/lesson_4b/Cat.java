package lesson_4b;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public boolean isHungry() {
        if (satiety) {
            System.out.println(name + " is full");
        } else {
            System.out.println(name + " is hungry");
        }
        return satiety;
    }

}


