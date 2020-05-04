package library;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//todo emprolijar acceso a metodos para que solo sean accesibles desde la clase

//Consideraciones, por cuestiones de simplificar, un cliente puede ser autor, pero no va a estar registrado en el sistema
//Sino lo consideraba asi me traia problemas al momento de que una Persona quiera ser cliente.
//Implemente un sistema de stock para no repetir ocurrencias del mismo libro

public class Library {
    List<Text> textList = new ArrayList<>();
    List<Client> clientList = new ArrayList<>();
//    List <Person> authorLists = new ArrayList<>();
//    List <Genre> genreLists = new ArrayList<>();

    private int getText(Text text) {
        int pos = 0;
        while (pos < textList.size()) {
            if (textList.get(pos).equals(text)) {
                return pos;
            }
            ++pos;
        }
        return -1;
    }


    public void addText(Text text){
        ListIterator<Text> textListIterator = textList.listIterator();
        int position = this.getText(text);
        if (position != -1){ //Si ya esta en stock, aumenta su stock
            textList.get(position).increaseStock();
        }
    }

    public void addText(Text text,int quantity){
        ListIterator<Text> textListIterator = textList.listIterator();
        int position = this.getText(text);
        if (position != -1){ //Si ya esta en stock, aumenta su stock
            textList.get(position).increaseStock(quantity);
        }
        else{
            text.setStock(quantity);
            textList.add(text);
        }
    }

    public double getPrice(Text text, Client client) {
        return client.getPrice(text);
    }

    public int getStock(Text text) {
        return textList.get(getText(text)).getStock();
    }

    private void addClient(Client client) {
        if (!clientList.contains(client)) {
            clientList.add(client);
        }
    }

    public boolean sellText(Book book, Client client) {
        int position = this.getText(book);
        Text requiredBook = textList.get(position);
        if (position != -1 && requiredBook.getStock() > 0) {
            addClient(client);
            requiredBook.decreaseStock();
            client.addPurchase(new Book(book.getName(), book.getAuthor(), client.getPrice(book), book.getPages(), book.getOverview(), book.getGenre())); //Agrego una copia
            return true;
        }
        return false;
    }

    public boolean sellText(Magazine magazine, Client client) {
        int position = this.getText(magazine);
        Text requiredBook = textList.get(position);
        if (position != -1 && requiredBook.getStock() > 0) {
            addClient(client);
            requiredBook.decreaseStock();
            client.addPurchase(new Magazine(magazine.getName(), magazine.getAuthor(), client.getPrice(magazine),
                    magazine.getVolume(), magazine.getYear())); //Agrego una copia
            return true;
        }
        return false;
    }

    public boolean likesAuthor(Client client, Book book) {
        return client.likes(book.getAuthor());
    }

    public boolean likesAuthorAndGenre(Client client, Book book) {
        return client.likes(book.getAuthor(), book.getGenre());
    }

    public boolean bought(Client client, Text text) {
        return client.bought(text);
    }

    @Override
    public String toString() {
        return "Library{" +
                "textList=" + textList + "\n" +
                ", clientList=" + clientList + "\n" +
                '}';
    }

`

    public static void main(String[] args) {
        Library library = new Library(); //Instancio una libreria
        Genre terror = new Genre("terror"); //Creo un genero
        Genre ficcion = new Genre("ficcion"); //Creo un genero
        Client_C juan = new Client_C(41824820, "Juan", "Dure", "M", ""); //Creo un cliente

        Client gabriel = new Client(00000000, "Gabriel", "Garcia Marquez", "male", ""); //Creo un autor
        Client jose = new Client(00000000, "Jose", "Perez", "male", ""); //Creo un autor

        Book libro_a = new Book("Cien años de soledad", gabriel, 500, 120, "", terror); //Creo un libro
        Book libro_b = new Book("Cien años de soledad 2", gabriel, 500, 120, "", ficcion); //Creo un libro
        Magazine revista_c = new Magazine("Revista Caras", jose, 100.00, 23, 2010);//Creo una revista

        juan.addAuthor(gabriel);

        juan.addGenre(terror);

        System.out.println(juan.toString()); //Deberia gustarle porque le gusta el autor

        System.out.println(library.likesAuthor(juan, libro_a)); //Deberia gustarle porque le gusta el autor
        System.out.println(library.likesAuthorAndGenre(juan, libro_b)); //No deberia gustarle porque no le gusta el genero

//        System.out.println(library.likes(juan,gabriel,terror));

//        System.out.println(library.isLikedBy(juan_c,b.getAuthor())); //todo fix likes
        library.addText(libro_a, 100);
//        System.out.println(library.getStock(a));
        library.sellText(libro_a, juan);


        System.out.println(library.toString()); //Mostrar el estado de la libreria con el libro comprado
//        System.out.println(library.likes(juan_c,juan,terror));
//        System.out.println(a.getStock());
        //System.out.println(juan.toString());
//        System.out.println(library.toString());
    }
}
