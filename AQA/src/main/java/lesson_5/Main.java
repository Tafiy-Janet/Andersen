package lesson_5;



public class Main {
    public static void main(String args[]) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println(apple.color);
        System.out.println(orange.color);

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(apple);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);
        appleBox.compare(orangeBox);
        appleBox.getWeight();
        orangeBox.getWeight();

        FruitGarden<Apple> appleFruitGarden = new FruitGarden<>(Apple::new);
        FruitGarden<Orange> orangeFruitGarden = new FruitGarden<>(Orange::new);
        appleBox.addFruit(appleFruitGarden.getFruits(99));
        orangeBox.addFruit(orangeFruitGarden.getFruits(55));
        appleBox.getWeight();
        orangeBox.getWeight();

        System.out.println("");

        Box<Apple> emptyAppleBox = new Box<>();
        appleBox.transferFruits(emptyAppleBox);
        Box<Orange> emptyOrangeBox = new Box<>();
        orangeBox.transferFruits(emptyOrangeBox);
    }

}
