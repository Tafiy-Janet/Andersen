package lesson_7;


public class Main {
    public static void main(String args[]) {
        AppData appData = new AppData("lesson_7/data.csv",";");
        appData.save("AQA/src/resources/lesson_7/data.csv",";");
    }

}
