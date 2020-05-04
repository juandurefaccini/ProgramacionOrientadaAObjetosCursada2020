package library;

public class Client_B extends Client{
    public Client_B(int id, String name, String last_name, String genre, String address){
        super(id, name, last_name, genre, address);
    }

    public double getPrice(Text text){
        return text.getPrice()/1.15;
    }
}
