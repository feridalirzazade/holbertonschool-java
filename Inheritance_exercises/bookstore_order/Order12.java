public class Order12 {

    private double discountPercentage;
    private ItemOrder12[] items;

    public Order12(double discountPercentage, ItemOrder12[] items){
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal(){
        double subTotal = 0;
        for (ItemOrder12 item: items){
            subTotal += item.getQuantity() * item.getProduct().getNetPrice();
        }
        return subTotal * (1 - discountPercentage / 100);
    }
}
