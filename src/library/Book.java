package library;

public class Book extends Text{
    int pages;
    String overview;
    Genre genre;

    public Book(String name, Person author, double price,int pages,String overview,Genre genre){
        super(name,author,price);
        this.pages = pages;
        this.overview = overview;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }
}
