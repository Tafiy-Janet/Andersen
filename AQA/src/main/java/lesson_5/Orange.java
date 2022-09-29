package lesson_5;


public class Orange extends Fruit{

    protected final String[] colors = {"orange","green","red"};

    public Orange() {
        super(1.5f);
        setRandomColor();
    }

    @Override
    public String[] getColors() {
        return this.colors;
    }
}
