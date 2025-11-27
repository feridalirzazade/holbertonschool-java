package providers;

public class UnitedParcelService implements ShippingProvider{

    @Override
    public Shipping calculateShipping(double weight, double value) {
        Shipping shipping = new Shipping();
        shipping.setShippingProviderType(ShippingProviderType.UPS);
        if(weight > 2000){
            shipping.setValue(value * 0.07);
        }
        else shipping.setValue(value * 0.045);
        return shipping;
    }

}
