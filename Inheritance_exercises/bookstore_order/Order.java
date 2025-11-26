public class Order {

    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items){
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal(){
        double subTotal = 0;
        for (ItemOrder item: items){
            subTotal += item.getQuantity() * item.getProduct().getNetPrice();
        }
        return subTotal * (1 - discountPercentage / 100);
    }
}
