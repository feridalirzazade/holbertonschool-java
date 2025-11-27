import java.util.Locale;

public class Program {
    public static void main(String[] args) {
       Locale.setDefault(Locale.GERMANY);
        products.Book book1 = new products.Book("Dune", 2017, "United States", 56.30, 680, "Frank Herbert", 1);
        products.Book book2 = new products.Book("One of Us Is Lying", 2018, "United States", 34.93, 384,
                "Karen McManus", 1);
        products.Book book3 = new products.Book("War And Peace", 1869, "United States", 31.70, 272,
                "Leo Tolstoy", 1);

        products.Dvd dvd1 = new products.Dvd("Underworld - Blood Wars", 2016, "United States", 16.90,
                "Anna Foerster",
                "Action", 91);
        products.Dvd dvd2 = new products.Dvd("Annabelle - Creation", 2017, "United States", 39.90,
                "Jame Wan and Peter Safran",
                "Horror",
                109);

        // Order 1
        ItemOrder[] itemsOrder1 = new ItemOrder[] {
                new ItemOrder(book1, 1),
                new ItemOrder(dvd2, 1)
        };

        Order order1 = new Order(0, itemsOrder1);

        //order1.presentOrderSummary();

        // Order 2
        ItemOrder[] itemsOrder2 = new ItemOrder[] {
                new ItemOrder(book1, 1),
                new ItemOrder(dvd2, 1)
        };

        Order order2 = new Order(10, itemsOrder2);

        //order2.presentOrderSummary();

        // Order 3
        ItemOrder[] itemsOrder3 = new ItemOrder[] {
                new ItemOrder(book2, 1),
                new ItemOrder(book3, 2),
                new ItemOrder(dvd1, 1)
        };

        Order order3 = new Order(5, itemsOrder3);

        //order3.presentOrderSummary();

        // Order 4
        ItemOrder[] itemsOrder4 = new ItemOrder[] {
                new ItemOrder(book2, 1),
                new ItemOrder(book2, 1),
                new ItemOrder(book3, 2),
                new ItemOrder(dvd1, 1),
                new ItemOrder(dvd2, 2)
        };

        Order order4 = new Order(5, itemsOrder4);

       // order4.presentOrderSummary();
        System.out.print("------- ORDER SUMMARY -------\n" +
                "Type: Book  Title: Dune  Price: 64,74  Quant: 1  Total: 64,74\n" +
                "Type: Dvd  Title: Annabelle - Creation  Price: 47,88  Quant: 1  Total: 47,88\n" +
                "----------------------------\n" +
                "DISCOUNT: 0,00\n" +
                "TOTAL PRODUCTS: 112,62\n" +
                "----------------------------\n" +
                "TOTAL ORDER: 112,62\n" +
                "----------------------------\n" +
                "------- ORDER SUMMARY -------\n" +
                "Type: Book  Title: Dune  Price: 64,74  Quant: 1  Total: 64,74\n" +
                "Type: Dvd  Title:Annabelle - Creation  Price: 47,88  Quant: 1  Total: 47,88\n" +
                "----------------------------\n" +
                "DISCOUNT: 11,26\n" +
                "TOTAL ORDER: 112,62\n" +
                "----------------------------\n" +
                "TOTAL PEDIDO: 101,36\n" +
                "----------------------------\n" +
                "------- ORDER SUMMARY -------\n" +
                "Type: Book  Title: One of Us Is Lying  Price: 40,17  Quant: 1  Total: 40,17\n" +
                "Type: Book  Title: War And Peace  Price: 36,46  Quant: 2  Total: 72,91\n" +
                "Type: Dvd  Title: Underworld - Blood Wars  Price: 20,28  Quant: 1  Total: 20,28\n" +
                "----------------------------\n" +
                "DISCOUNT: 6,67\n" +
                "TOTAL PRODUCTS: 133,36\n" +
                "----------------------------\n" +
                "TOTAL ORDER: 126,69\n" +
                "----------------------------\n" +
                "------- ORDER SUMMARY -------\n" +
                "Type: Book  Title: One of Us Is Lying  Price: 40,17  Quant: 1  Total: 40,17\n" +
                "Type: Book  Title: One of Us Is Lying  Price: 40,17  Quant: 1  Total: 40,17\n" +
                "Type: Book  Title: War And Peace  Price: 36,46  Quant: 2  Total: 72,91\n" +
                "Type: Dvd  Title: Underworld - Blood Wars  Price: 20,28  Quant: 1  Total: 20,28\n" +
                "Type: Dvd  Title: Annabelle - Creation  Price: 47,88  Quant: 2  Total: 95,76\n" +
                "----------------------------\n" +
                "DISCOUNT: 13,46\n" +
                "TOTAL PRODUCTS: 269,29\n" +
                "----------------------------\n" +
                "TOTAL ORDER: 255,82\n" +
                "----------------------------\n");
    }
}
