package pl.sdacademy.javapoz19programowanie1.books;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class BooksViews {
    private Scanner scanner;

    public BooksViews(Scanner scanner) {
        this.scanner = scanner;
    }

    public int startMenu() {
        System.out.println("1. Authors");
        System.out.println("2. Books");
        System.out.println("3. Koniec");
        return getDecisionAfterEnter();
    }

    private int getDecision() {
        return scanner.nextInt();

    }

    public Nation getNation() {
        String nationAsString = scanner.nextLine().trim();
        return Nation.valueOf(nationAsString);
    }

    private int getDecisionAfterEnter() {
        return readIntAndClearLine();
    }

    public int authorsMenu(List<Author> authors) {
        authors.forEach(author -> System.out.println(author));
        System.out.println();
        System.out.println("1.Find by nation (PL, ENG, USA)");
        System.out.println("2.Find by  ()");
        System.out.println("0.wroc  ()");
        return getDecision();
    }

    public int booksMenu(List<Book> books) {
        books.stream().forEach((book -> System.out.println(book)));
        System.out.println();
        System.out.println("1. Find by after release year");
        System.out.println("2. Search title");
        System.out.println("3. Search by author");
        System.out.println("0. Back");
        return getDecision();
    }

    public int getReleaseYear() {
        return readIntAndClearLine();
    }

    private int readIntAndClearLine() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public String getPhrase() {
        return scanner.nextLine().trim();
    }
}

