package library;

public class Client_A extends Client{
    public Client_A(int id, String name, String last_name, String genre, String address){
        super(id, name, last_name, genre, address);
    }

    @Override
    public double getPrice(Text text){
        return text.getPrice()/1.1;
    }

    @Override
    public String toString() {
        return super.toString();
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
