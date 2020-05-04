package library;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Client {
    String address = "n";
    List<Client> favouriteAuthors = new ArrayList<>();
    List<Genre> favouriteGenres = new ArrayList<>();
    List<Text> purchasingRecord = new ArrayList<>();
    int id = 0;
    String name = "n";
    String last_name = "n";
    String genre = "n";


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(address, client.address) &&
                Objects.equals(favouriteAuthors, client.favouriteAuthors) &&
                Objects.equals(favouriteGenres, client.favouriteGenres) &&
                Objects.equals(purchasingRecord, client.purchasingRecord) &&
                Objects.equals(name, client.name) &&
                Objects.equals(last_name, client.last_name) &&
                Objects.equals(genre, client.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, favouriteAuthors, favouriteGenres, purchasingRecord, id, name, last_name, genre);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return last_name;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Client() {
    }
//

    public Client(int id, String name, String last_name, String genre, String address) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.genre = genre;
    }

    public boolean bought(Text text){
        return purchasingRecord.contains(text);
    }

    public boolean likeGenre(Genre genre) {
        return favouriteGenres.contains(genre);
    }

    public boolean likeAuthor(Client author) {
        return favouriteAuthors.contains(author);
    }

    public boolean addGenre(Genre genre) {
        if (!this.likeGenre(genre)) {
            favouriteGenres.add(genre);
            return true;
        }
        return false;
    }

    public boolean addAuthor(Client author) {
        if (!this.likeAuthor(author)) {
            favouriteAuthors.add(author);
            return true;
        }
        return false;
    }

    private int getText(Text text){
        int pos = 0;
        while (pos < purchasingRecord.size()){
            if (purchasingRecord.get(pos).equals(text)){
                return pos;
            }
            ++pos;
        }
        return -1;
    }
    public void addPurchase(Text text) {
        ListIterator<Text> textListIterator = purchasingRecord.listIterator();
        int position = this.getText(text);
        if (position != -1){ //Si ya esta en stock, aumenta su stock
            purchasingRecord.get(position).increaseStock();
        }
        else{
            purchasingRecord.add(text);
        }
    }

    public double getPrice(Text text){
        return text.getPrice();
    }

    public boolean likes(Client author) {
        return favouriteAuthors.contains(author);
    }

    public boolean likes(Client author, Genre genre) {
        return favouriteAuthors.contains(author) && favouriteGenres.contains(genre);
    }

    @Override
    public String toString() {
        return "Client = " + name + "\n" +
                "favouriteAuthors=" + favouriteAuthors +
                "\n" +"favouriteGenres=" + favouriteGenres +
                "\n" +"purchasingRecord=" + this.purchasingRecord;
    }

    public static void main(String[] args) {
//        Client_A juan = new Client_A(41824820,"Juan","Dure","M","");
//        Text a = new Text("Juan","Juan",500);
//
//        juan.addPurchase(a);
//        juan.addPurchase(a);
//        juan.addPurchase(a);
//        System.out.println(juan.toString());
    }
}
