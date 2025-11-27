import java.util.Locale;
public class Order {

    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items){
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY ------");

        double totalProducts = 0;

        for (ItemOrder item : items) {
            String type = item.getProduct().getClass().getSimpleName();
            String title = item.getProduct().getTitle();
            double price = item.getProduct().getNetPrice();
            int quantity = item.getQuantity();
            double total = price * quantity;
            totalProducts += total;

            System.out.printf("Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f\n",
                    type, title, price, quantity, total);
        }
        System.out.println("----------------------------");
        double discountAmount = totalProducts * discountPercentage / 100.0;
        System.out.printf("DISCOUNT: %.2f\n", discountAmount);
        System.out.printf("TOTAL PRODUCTS: %.2f\n", totalProducts);
        System.out.println("----------------------------");
        System.out.printf("TOTAL ORDER: %.2f\n", totalProducts - discountAmount);
        System.out.println("----------------------------");
    }
    public double calculateTotal(){
        double subTotal = 0;
        for (ItemOrder item: items){
            subTotal += item.getQuantity() * item.getProduct().getNetPrice();
        }
        return subTotal * (1 - discountPercentage / 100);
    }
}
