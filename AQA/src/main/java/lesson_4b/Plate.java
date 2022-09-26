package lesson_4b;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food = Math.max(0, food - amount);
    }

    public void info() {
        System.out.println("Food amount: " + food + "g");
    }
    public void addFood(int foodAmount) {
        food += foodAmount;
        System.out.println("Food amount after refill: " + food + "g");
    }

}

