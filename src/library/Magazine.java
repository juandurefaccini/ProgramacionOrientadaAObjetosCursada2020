package library;

public class Magazine extends Text {
    int volume;
    int year;

    public Magazine(String name, Person author, double price, int volume,int year){
        super(name, author, price);
        this.volume = volume;
        this.year = year;
    }
}
