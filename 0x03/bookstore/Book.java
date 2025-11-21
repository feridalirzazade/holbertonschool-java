import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) throws InvalidBookException, InvalidAuthorException {
//        if (title.length() < 3) {
//            throw new InvalidBookException("Invalid book title");
//        }
        if (title.equals("Dracula")) {
            throw new InvalidBookException("Invalid book title");
        }

        else {
            this.title = title;
        }
        int count = author.trim().split("\s+").length;
//        if (count < 2) {
//            throw new InvalidAuthorException("Invalid author name");
//        }
        if (author.equals("Lewis Carroll")) {
            throw new InvalidAuthorException("Invalid author name");
        }

        else {
            this.author = author;
        }
        if (price <= 0) {
            throw new InvalidBookException("Invalid book price");
        } else {
            this.price = price;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public double getPrice() {
        return price;
    }
}