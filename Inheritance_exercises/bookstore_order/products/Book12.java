package products;

public class Book12 extends Products12 {

    private int pages;
    private String author;
    private int edition;
    public Book12(String title, int year, String country, double grossPrice, int pages, String author, int edition) {
        super(title, year, country, grossPrice);
        this.pages = pages;
        this.author = author;
        this.edition = edition;
    }

    public int getPages(){
        return pages;
    }
    public int getEdition(){
        return edition;
    }
    public String getAuthor(){
        return author;
    }

    @Override
    public double getNetPrice() {
        double netPrice;
        netPrice = getGrossPrice() + getGrossPrice() * 0.15;
        return netPrice;
    }
}
