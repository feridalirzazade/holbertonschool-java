package providers;

public class Fedex implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        Shipping shipping = new Shipping();
        shipping.setShippingProviderType(ShippingProviderType.FEDEX);
        if(weight > 1000){
            shipping.setValue(value * 0.1);
        }
        else shipping.setValue(value * 0.05);
        return shipping;
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return null;
    }

}
