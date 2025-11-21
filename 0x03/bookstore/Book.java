package bookstore;

import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class Book {
    String title;
    String author;
    double price;

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }

    Book(String title, String author, double price) throws InvalidAuthorException, InvalidBookException{
        if(title.length() >= 3){
            this.title = title;
        }
        else throw new InvalidBookException("Invalid book title");
        int count = author.trim().split("\s+").length;
        if (count < 2) {
            throw new InvalidAuthorException("Invalid author name");
        }
        else {
            this.author = author;
        }
        if(price > 0 ){
            this.price = price;
        }
        else throw new InvalidBookException("Invalid book price");
    }
}
