package com.tp2;
public class Person {
    String name;
    String last_name;
    int age;
    Date birth_date;
    int id;
    String genre;
    double weight;
    double height;

    //Agrego esto para el ejercicio, de mas adelante del praactico
    String number;
    String email;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return last_name;
    }

    public Date getBirthDate() {
        return birth_date;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person(String name, String last_name, String number, String email) {
        this.name = name;
        this.last_name = last_name;
        this.number = number;
        this.email = email;
    }

    public Person(int id) {
        birth_date = new Date(1, 1, 2000);
        genre = "female";
        name = "N";
        last_name = "N";
        weight = 1;
        height = 1;
        //Calculo Age?
    }

    public Person(int dni, String name, String last_name) {
        birth_date = new Date(1, 1, 2000);
        genre = "female";
        this.name = name;
        this.last_name = last_name;
        weight = 1;
        height = 1;
    }
    public Person(int dni, String name, String last_name, Date birth_date){
        this.birth_date = birth_date;
        age = birth_date.getYearsToToday();
        genre = "female";
        this.name = name;
        this.last_name = last_name;
        weight = 1;
        height = 1;
    }
    public Person(int dni, String name, String last_name, Date birth_date,String genre){
        this.birth_date = birth_date;
        age = birth_date.getYearsToToday();
        this.genre = genre;
        this.name = name;
        this.last_name = last_name;
        weight = 1;
        height = 1;
    }
    public Person(int dni, String name, String last_name, Date birth_date,String genre,double weight,double height){
        this.birth_date = birth_date;
        age = birth_date.getYearsToToday();
        this.genre = genre;
        this.name = name;
        this.last_name = last_name;
        this.weight = weight;
        this.height = height;
    }

    public double bodyMass(){
        return getWeight()/getHeight();
    }
    public boolean healthy(){
        return bodyMass() > 18.5 && bodyMass() < 25;
    }
    public boolean birthday(){
        boolean birthday;
        Date now = new Date(18,4,2020);
        return birth_date.getHash() == now.getHash();
    }
    public boolean isAdult(){
        return getAge()>=18;
    }
    public boolean canVote(){
        return getAge()>=16;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", birth_date=" + birth_date +
                ", id=" + id +
                ", genre='" + genre + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Person Juan = new Person(41824820,"Juan","Dure",new Date(11,4,1999),"male",99,1.90);
        System.out.println(Juan.bodyMass());
        System.out.println(Juan.healthy());
        Person Juancho = new Person(8000000,"Juancho","Duramen",new Date(18,4,2020),"male",99,1.90);
        System.out.println(Juancho.birthday());
        System.out.println(Juan.toString());
    }
}