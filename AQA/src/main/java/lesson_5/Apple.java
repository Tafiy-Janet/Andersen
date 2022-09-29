package lesson_5;


public class Apple extends Fruit{

    protected final String[] colors = {"green","yellow","white","red"};

    public Apple() {
        super(1.0f);
        setRandomColor();
    }
    @Override
    public String[] getColors() {
        return this.colors;
    }
}
