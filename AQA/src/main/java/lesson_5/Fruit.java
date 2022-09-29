package lesson_5;

import java.util.Random;

public class Fruit {
    protected float weight;
    protected String color;
    protected String[] colors = {"grey"};


    public Fruit(float weight) {
        this.weight = weight;

    }

    public float getWeight(){
        return this.weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setRandomColor(){
        Random random = new Random();
        String[] allColors = this.getColors();
        this.setColor(allColors[random.nextInt(allColors.length)]);
    }

    public String[] getColors() {
        return colors;
    }
}
