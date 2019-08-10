package pl.sdacademy.javapo19programowanie1;


import pl.sdacademy.javapo19programowanie1.books.Author;
import pl.sdacademy.javapo19programowanie1.books.Nation;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Author autor1 = new Author("Joanne", "Murray", 1965, Nation.ENG);
        Author autor2 = new Author("Stanisław", "Lem", 1921, Nation.PL);
        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("King");
        author.setBirthYear(1947);
        author.setNation(Nation.USA);

        List<Author> authors = Arrays.asList(author, autor1, autor2,
                new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG));

//        List<Author> authors = Arrays.asList(author, autor1, autor2);
//        showByNationAnAfterBrithYear(authors, Nation.PL);
//        showModernAuthors(authors);
//        showByNationAnAfterBrithYear(authors, Nation.PL);
        System.out.println(groupByNation(authors));
    }


    public static void showModernAuthors(List<Author> authors) {
        for (Author author : authors) {
            if (author.getBirthYear() > 1895) {
                System.out.println(author);
            }
        }

    }

    public static void showByNationAnAfterBrithYear(List<Author> authors, Nation nation) {
        for (Author author : authors) {
            if (author.getNation().equals(nation) && author.getBirthYear() > 1899) {
                System.out.println(author);
            }
        }
    }

    private static Map<Nation, List<Author>> groupByNation (List <Author> authors) {
        Map<Nation, List<Author>>map = new HashMap<>();
        for (Author author : authors) {
            map.putIfAbsent(author.getNation(), new ArrayList<>());
            map.get(author.getNation()).add(author);
        }
        return map;
    }
}