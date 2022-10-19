package lesson_4d;

public class Main {
    public static void main(String args[]) {
        Park park = new Park();
        park.addAttraction("Pirates of Caribbean","9-16",200);
        park.addAttraction("Peppy World","9-16",300);
        park.getAttractionsInfo();
    }
}
