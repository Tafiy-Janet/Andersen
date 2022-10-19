package lesson_4d;

import java.util.*;


public class Park {
    private Scanner scanner = new Scanner(System.in);
    protected List<Attraction> attractions = new ArrayList<>();
    protected List<String> attractionsNames = new ArrayList<>();

    public List<String> getAttractionsNames() {
        attractionsNames.clear();
        attractions.forEach(
                attraction -> {
                    attractionsNames.add(attraction.getName());
                });
        return attractionsNames;
    }


    public void addAttraction(String name,String workingHours, int price) {
        Attraction newAttraction = new Attraction();
        newAttraction.setPrice(price);
        newAttraction.setWorkingHours(workingHours);
        newAttraction.setName(name);
        System.out.println("Added attraction: " + newAttraction);
        attractions.add(newAttraction);
    }

    public void getAttractionsInfo() {
        System.out.println("To get full info about attraction choose any of following: " + String.join(", ", getAttractionsNames()) +
                "\nType only ordinal number of desired attraction.");
        int selectedAttraction = scanner.nextInt() - 1;
        Attraction attraction = attractions.get(selectedAttraction);
        System.out.println(attraction);
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction() {
        }

        public Attraction(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return ("\nName: "
                    + getName()
                    + "\nWorking hours: "
                    + getWorkingHours()
                    + "\nPrice: "
                    + getPrice()
            );
        }
    }

}
