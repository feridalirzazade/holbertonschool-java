package providers;

public class Shipping {
    private double value;
    private ShippingProviderType shippingProviderType;

    public double getValue(){
        return value;
    }
    public ShippingProviderType getShippingProviderType(){
        return shippingProviderType;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setShippingProviderType(ShippingProviderType shippingProviderType) {
        this.shippingProviderType = shippingProviderType;
    }

}
