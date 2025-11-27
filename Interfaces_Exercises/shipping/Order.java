import providers.Shipping;
import providers.ShippingProvider;

public class Order {

    private int code;
    private int weight;
    private double total;
    private Shipping shipping;

    Order(int code, int weight, double total){
        this.code = code;
        this.weight = weight;
        this.total = total;
    }
    public int getCode(){
        return code;
    }
    public int getWeight(){
        return weight;
    }
    public double getTotal(){
        return total;
    }
    public Shipping getShipping(){
        return shipping;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}
