package library;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Client extends Person {
    String address = "n";
    List<Person> favouriteAuthors = new ArrayList<>();
    List<Genre> favouriteGenres = new ArrayList<>();
    List<Text> purchasingRecord = new ArrayList<>();

    public Client(){    }

    public Client(int id, String name, String last_name, String genre, String address) {
        super(id, name, last_name, genre);
        this.address = address;
    }

    public boolean bought(Text text){
        return purchasingRecord.contains(text);
    }

    public boolean likeGenre(Genre genre) {
        return favouriteGenres.contains(genre);
    }
    public boolean likeAuthor(Person author) {
        return favouriteAuthors.contains(author);
    }

    public boolean addGenre(Genre genre) {
        if (!this.likeGenre(genre)) {
            favouriteGenres.add(genre);
            return true;
        }
        return false;
    }
    public boolean addAuthor(Person author) {
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
    };

    public boolean likes(Person author){
        return favouriteAuthors.contains(author);
    }

    public boolean likes(Person author,Genre genre){
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
