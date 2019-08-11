package pl.sdacademy.javapoz19programowanie1.books;

public class Book {
    private String title;
    private int relaseYear;
    private int pages;
    private  Author author;

    public Book() {
    }

    public Author getAuthor() {
        return author;
    }

    public Book(String title, int relaseYear, int pages, Author author) {
        this.title = title;
        this.relaseYear = relaseYear;
        this.pages = pages;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", relaseYear=" + relaseYear +
                ", pages=" + pages +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelaseYear() {
        return relaseYear;
    }

    public void setRelaseYear(int relaseYear) {
        this.relaseYear = relaseYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
