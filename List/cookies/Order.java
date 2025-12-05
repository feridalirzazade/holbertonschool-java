import java.util.ArrayList;
import java.util.Objects;

public class Order {
    ArrayList<CookieOrder> cookies = new ArrayList<>();

    public void addCookieOrder(CookieOrder order){
        cookies.add(order);
    }
    public int getTotalBoxes(){
        int total = 0;
        for (CookieOrder order: cookies){
            total += order.getBoxQuantity();
        }
        return total;
    }

    public int removeFlavor(String flavor) {
        int totalRemoved = 0;

        for (int i = cookies.size() - 1; i >= 0; i--) {
            CookieOrder order = cookies.get(i);
            if (order.getFlavor().equals(flavor)) {
                totalRemoved += order.getBoxQuantity();
                cookies.remove(i);
            }
        }
        return totalRemoved;
    }

}
