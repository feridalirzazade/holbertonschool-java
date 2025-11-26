import products.Book12;
import products.Dvd12;

import java.util.Locale;

public class Program22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);
        Book12 book1 = new Book12("Dune", 2017, "United States", 56.30, 680, "Frank Herbert", 1);
        Book12 book2 = new Book12("One of Us Is Lying", 2018, "United States", 34.93, 384,
                "Karen McManus", 1);
        Book12 book3 = new Book12("War And Peace", 1869, "United States", 31.70, 272,
                "Leo Tolstoy", 1);

        Dvd12 dvd1 = new Dvd12("Underworld - Blood Wars", 2016, "United States", 16.90,
                "Anna Foerster",
                "Action", 91);
        Dvd12 dvd2 = new Dvd12("Annabelle - Creation", 2017, "United States", 39.90,
                "Jame Wan and Peter Safran",
                "Horror",
                109);

        // Order 1
        ItemOrder12[] itemOrder1 = new ItemOrder12[] {
                new ItemOrder12(book1, 1),
                new ItemOrder12(dvd2, 1)
        };

        Order12 order1 = new Order12(0, itemOrder1);

        System.out.printf("Total Order: %.2f\n", order1.calculateTotal());

        // Order 2
        ItemOrder12[] itemOrder2 = new ItemOrder12[] {
                new ItemOrder12(book1, 1),
                new ItemOrder12(dvd2, 1)
        };

        Order12 order2 = new Order12(10, itemOrder2);

        System.out.printf("Total Order: %.2f\n", order2.calculateTotal());

        // Order 3
        ItemOrder12[] itemOrder3 = new ItemOrder12[] {
                new ItemOrder12(book2, 1),
                new ItemOrder12(book3, 2),
                new ItemOrder12(dvd1, 1)
        };

        Order12 order3 = new Order12(5, itemOrder3);

        System.out.printf("Total Order: %.2f\n", order3.calculateTotal());

        // Order 4
        ItemOrder12[] itemOrder4 = new ItemOrder12[] {
                new ItemOrder12(book2, 1),
                new ItemOrder12(book2, 1),
                new ItemOrder12(book3, 2),
                new ItemOrder12(dvd1, 1),
                new ItemOrder12(dvd2, 2)
        };

        Order12 order4 = new Order12(5, itemOrder4);

        System.out.printf("Total Order: %.2f\n", order4.calculateTotal());
    }
}
