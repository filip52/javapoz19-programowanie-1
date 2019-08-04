package pl.sdacademy.javapo19programowanie1.books;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();
}
