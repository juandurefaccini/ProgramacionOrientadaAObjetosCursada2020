package library;

import com.tp2.Date;

import java.util.Objects;

public class Person {
    int id = 0;
    String name = "n";
    String last_name = "n";
    String genre = "n";

    public Person() {
    }

    public Person(int id, String name, String last_name, String genre) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name) &&
                Objects.equals(last_name, person.last_name) &&
                Objects.equals(genre, person.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, last_name, genre);
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

}
