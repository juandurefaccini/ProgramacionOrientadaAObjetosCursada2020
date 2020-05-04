package library;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//todo emprolijar acceso a metodos para que solo sean accesibles desde la clase
public class Library {
    List<Text> textList = new ArrayList<Text>();

    private int getText(Text text){
        int pos = 0;
        while (pos < textList.size()){
            if (textList.get(pos).equals(text)){
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

    public double getPrice(Text text,Client client){
        return client.getPrice(text);
    }

    public int getStock(Text text){
        return textList.get(getText(text)).getStock();
    }

    public boolean sellText(Text text,Client client){
        int position = this.getText(text);
        if (position != -1 && textList.get(position).isStock()){
            textList.get(position).decreaseStock();
            client.addPurchase(new Text(text.getName(),text.getAuthor(),this.getPrice(text,client))); //Agrego una copia
            return true;
        }
        return false;
    }

    public boolean isLikedBy(Client client,Person author){
        return client.likes(author);
    }
    public boolean isLikedBy(Client client,Person author,Genre genre){
        return client.likes(author,genre);
    }

    public boolean bought(Client client,Text text){
        return client.bought(text);
    }

    public static void main(String[] args) {
        Library library = new Library();
        Person juan = new Person(41824820,"Juan","Dure","m");
        Genre terror = new Genre("terror");

        Text a = new Text("BB Juan",juan,500);
        Book b = new Book("1",juan,100.00,100,"",terror);

        Client_C juan_c = new Client_C(41824820,"Juan","Dure","M","");
        System.out.println(library.isLikedBy(juan_c,b.getAuthor())); //todo fix likes
        library.addText(a,100);
        System.out.println(library.getStock(a));
        library.sellText(a,juan_c);

        System.out.println(a.getStock());
        System.out.println(juan.toString());
    }
}
