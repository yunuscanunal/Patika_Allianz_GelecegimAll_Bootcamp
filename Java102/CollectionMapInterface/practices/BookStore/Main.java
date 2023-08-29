import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Book E", 300, "Author X", "2022-01-15"));
        bookSetByName.add(new Book("Book A", 250, "Author Y", "2021-05-03"));
        bookSetByName.add(new Book("Book C", 180, "Author Z", "2020-11-20"));
        bookSetByName.add(new Book("Book B", 400, "Author X", "2023-02-10"));
        bookSetByName.add(new Book("Book D", 150, "Author Z", "2019-08-05"));

        System.out.println("Books sorted by name:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getPageCount(), book2.getPageCount());
            }
        });

        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
