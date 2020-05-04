package library;

public class Client_C extends Client{
    public Client_C(int id, String name, String last_name, String genre, String address){
        super(id, name, last_name, genre, address);
    }

    public double getPrice(Text text){
        return text.getPrice()/1.3;
    }
}
