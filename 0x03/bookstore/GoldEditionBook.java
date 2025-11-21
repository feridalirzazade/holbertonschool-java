import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class GoldEditionBook extends Book{
    GoldEditionBook(String title, String author, double price) throws InvalidBookException, InvalidAuthorException {
        super(title, author, price);
    }
    @Override
    public double getPrice(){
        return price + (price/10)*3;
    }
}
