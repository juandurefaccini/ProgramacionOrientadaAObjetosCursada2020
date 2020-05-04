package library;

import java.util.Objects;

public class Book extends Text {
    int pages;
    String overview;
    Genre genre;

    public Book(String name, Client author, double price, int pages, String overview, Genre genre) {
        super(name, author, price);
        this.pages = pages;
        this.overview = overview;
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public String getOverview() {
        return overview;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Objects.equals(overview, book.overview) &&
                Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pages, overview, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
