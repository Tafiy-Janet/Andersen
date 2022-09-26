package lesson_4c;

import java.util.*;

public class Payment {

    private List<Product> shopBasket = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    Product[] readingItems = new Product[]{
            new Product("Portrait of Dorian Gray", 500),
            new Product("Bookmark", 200),
            new Product("E-book", 400),
            new Product("Forbes", 300)
    };
    Product[] tidingItems = new Product[]{
            new Product("Mop", 100),
            new Product("Vacuum cleaner", 2600),
            new Product("Cleaning spray", 40),
            new Product("Bin", 30)
    };
    Product[] kidsItems = new Product[]{
            new Product("Lego", 350),
            new Product("Barbie", 260),
            new Product("Trampoline", 700),
            new Product("Kite", 370)
    };
    Product[] hikingItems = new Product[]{
            new Product("Trekking poles", 1500),
            new Product("Vibram shoes", 2000),
            new Product("Tent", 8000),
            new Product("Sleeping bag", 3000)
    };
    Product[] fitnessItems = new Product[]{
            new Product("Yoga mat", 500),
            new Product("Dumbbells", 360),
            new Product("Treadmill", 4500),
            new Product("Skipping Rope", 600)
    };
    Map<String, Product[]> products = new HashMap<>() {
        {
            put("reading", readingItems);
            put("tiding", tidingItems);
            put("kid toys", kidsItems);
            put("hiking", hikingItems);
            put("fitness equipment", fitnessItems);
        }
    };

    public void addProduct() {
        System.out.println("Choose one category from assortment of a shop: " + String.join(", ", products.keySet()));
        String wish = scanner.nextLine().toLowerCase().trim();
        while (!products.containsKey(wish)) {
            wish = scanner.nextLine().toLowerCase().trim();
            System.out.println("Error message. Such category does not exist.");
        }
        Product[] category = products.get(wish);
        System.out.println("You can choose from next products. \n (please type only ordinal number of desired attraction)" + Arrays.toString(category)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", ","));
        int desiredProduct = scanner.nextInt() - 1;
        while (desiredProduct > category.length || desiredProduct < 0) {
            desiredProduct = scanner.nextInt();
            System.out.println("Please select available item.");
            scanner.nextInt();
        }
        shopBasket.add(category[desiredProduct]);
    }

    public boolean continuePurchase() {
        System.out.println("Are you want to continue your purchase? Type 'yes' or 'no'.");
        String answer = scanner.nextLine().toLowerCase().trim();
        while (!answer.contains("yes") && !answer.contains("no")) {
            answer = scanner.nextLine();
        }
        if (answer.equals("yes")) {
            return true;
        } else return false;
    }

    public void showBasket() {
        for (int i = 0; i < shopBasket.size(); i++) {
            System.out.println("Your basket contains: " + shopBasket.get(i));
        }
    }

    public void calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < shopBasket.size(); i++) {
            totalPrice += shopBasket.get(i).getPrice();
        }
        System.out.println("Total price: " + totalPrice + " hrn");
    }

    public void cancelPurchase() {
        System.out.println("Do you want to cancel your purchase? Type '1' if yes. \nOr do you want to make payment? Type '2' if yes");
        int answer = scanner.nextInt();
        if (answer == 1) {
            for (int i = 0; i < shopBasket.size(); i++) {
                shopBasket.clear();
            }
        } else if (answer == 2) {
            paymentMethod();
        }
    }

    public void paymentMethod() {
        System.out.println("Enter payment method: 'cash' or 'card'");
        scanner.nextLine();
        String pay = scanner.nextLine().toLowerCase().trim();
        if (pay.equals("card")) {
            System.out.println("Card number: 56 21 489 533 \nMake transaction and your purchase will be confirmed.");
        } else if (pay.equals("cash"))
            System.out.println("Your purchase is confirmed. We will send you message about your package delivery.");
    }

    private class Product {

        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }


        @Override
        public String toString() {
            return ("\n" + name
                    + " - "
                    + price
                    + " hrn");
        }

    }

}
