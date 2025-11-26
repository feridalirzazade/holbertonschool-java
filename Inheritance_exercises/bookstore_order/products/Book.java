package products;

public class Book extends Products{

    private int pages;
    private String author;
    private int edition;
    public Book(String title, int year, String country, double grossPrice, int pages, String author, int edition) {
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
