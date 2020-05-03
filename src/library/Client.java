package library;

import java.util.List;

public class Client extends Person {
    String address = "n";
    List<Person> favouriteAuthors;
    List<Genre> favouriteGenres;
    List<Text> purchasingRecord;

    public Client(int id, String name, String last_name, String genre, String address) {
        super(id, name, last_name, genre);
        this.address = address;
    }

    public boolean likeGenre(Genre genre) {
        return favouriteGenres.contains(genre);
    }

    public boolean likeAuthor(Person author) {
        return favouriteAuthors.contains(author)
    }

    public boolean addGenre(Genre genre) {
        if (!this.likeGenre(genre)) {
            favouriteGenres.add(genre);
            return true;
        }
        return false;
    }

    public boolean addAuthor(Person author) {
        if (!this.likeGenre(author)) {
            favouriteAuthors.add(author);
            return true;
        }
        return false;
    }

    public boolean addPurchase(Text text) { //Asumo que el usuario puede comprar el titulo mas de una vez, por ejemplo para regalo
        purchasingRecord.add(text);
        return true; //El return true lo dejo para respetar la estructura de los demas metodos
    }

}
