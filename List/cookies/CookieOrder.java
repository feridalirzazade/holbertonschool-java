import java.security.PublicKey;
import java.util.ArrayList;

public class CookieOrder {
    private String flavor;
    private int boxQuantity;
    private ArrayList<CookieOrder> cookies;

    public CookieOrder(String flavor, int boxQuantity){
        this.flavor = flavor;
        this.boxQuantity = boxQuantity;
        cookies = new ArrayList<>();
    }

    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public int getBoxQuantity() {
        return boxQuantity;
    }
    public void setBoxQuantity(int boxQuantity) {
        this.boxQuantity = boxQuantity;
    }
}
