import products.Products;

public class ItemOrder {
    private Products product;
    private int quantity;

    public ItemOrder(Products product, int quantity){
        this.quantity = quantity;
        this.product = product;
    }

    public Products getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
}
