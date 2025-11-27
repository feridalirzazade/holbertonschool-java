import providers.ShippingProvider;

public class OrderProcessor {
    private ShippingProvider shippingProvider;

    OrderProcessor(ShippingProvider shippingProvider){
        this.shippingProvider = shippingProvider;
    }

    public ShippingProvider getShippingProvider(){
        return shippingProvider;
    }

    public void process(Order order){
        order.setShipping(shippingProvider.calculateShipping(order.getWeight(), order.getTotal()));
    }
}
