package pl.sdacademy.javapo19programowanie1.books;

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
        int menu = scanner.nextInt();
        scanner.nextLine();
        return menu;
    }

    public int authorsMenu(List<Author> authors) {
        authors.stream()
                .forEach(author -> System.out.println(author));
        System.out.println();
        System.out.println("1.Find by nation (PL, ENG, USA)");
        System.out.println("2.Find by  ()");
        System.out.println("0.wroc  ()");
        return getDecision();
    }

}
