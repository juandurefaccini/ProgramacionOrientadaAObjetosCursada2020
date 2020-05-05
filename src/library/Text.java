package library;

import java.util.Objects;

abstract public class Text {
    String name = "n";
    Client author;
    double price = 0; //Los ultimos dos digitos son los centavos.
    int stock = 1; //Si se crea un libro, el stock inicialmente es 1

    public Text() {
    }

    public Text(String name, Client author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Client getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isStock(){
        return stock > 0;
    }

    public void increaseStock(){
        this.stock++;
    }

    public void increaseStock(int quantity){
        this.stock = stock + quantity;
    }

    public void decreaseStock(){
        this.stock--;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Text{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", STOCK='" + stock + '\'' +
                ", $='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(name, text.name) &&
                Objects.equals(author, text.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price);
    }
}
