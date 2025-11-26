import products.Products12;

public class ItemOrder12 {
    private Products12 product;
    private int quantity;

    public ItemOrder12(Products12 product, int quantity){
        this.quantity = quantity;
        this.product = product;
    }

    public Products12 getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
}
