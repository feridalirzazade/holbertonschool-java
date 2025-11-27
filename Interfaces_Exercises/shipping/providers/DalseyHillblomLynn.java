package providers;

public class DalseyHillblomLynn implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        Shipping shipping = new Shipping();
        shipping.setShippingProviderType(ShippingProviderType.DHL);
        if(weight > 5000){
            shipping.setValue(value * 0.12);
        }
        else shipping.setValue(value * 0.04);
        return shipping;
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return null;
    }

}
