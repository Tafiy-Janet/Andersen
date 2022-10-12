package lesson_4c;

public class Main {
    public static void main(String args[]) {
        Payment payment = new Payment();
        payment.addProduct();
        while(payment.continuePurchase()){
            payment.addProduct();
        }
        payment.showBasket();
        payment.calculateTotalPrice();
        payment.cancelPurchase();
    }

}
