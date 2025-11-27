import java.util.Locale;
public class Order {

    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items){
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public void presentOrderSummary() {

        System.out.println("------- ORDER SUMMARY -------");

        double totalProducts = 0.0;

        for (ItemOrder item : items) {

            String type = item.getProduct().getClass().getSimpleName();
            String title = item.getProduct().getTitle();
            double price = item.getProduct().getNetPrice();
            int quant = item.getQuantity();
            double total = price * quant;

            totalProducts += total;

            System.out.printf(
                    Locale.FRANCE,
                    "Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f%n",
                    type, title, price, quant, total
            );
        }

        System.out.println("----------------------------");

        double discountValue = totalProducts * (discountPercentage / 100);

        System.out.printf(Locale.FRANCE, "DISCOUNT: %.2f%n", discountValue);
        System.out.printf(Locale.FRANCE, "TOTAL PRODUCTS: %.2f%n", totalProducts);

        System.out.println("----------------------------");

        double finalTotal = totalProducts - discountValue;

        System.out.printf(Locale.FRANCE, "TOTAL ORDER: %.2f%n", finalTotal);

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
