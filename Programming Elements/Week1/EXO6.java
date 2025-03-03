public class EXO6 {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double discountedPrice = fee - discount;

        System.out.println("Discounted Amount: INR " + discount);
        System.out.println("Final Price to Pay: INR " + discountedPrice);
    }
}
