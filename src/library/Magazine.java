package library;

import java.util.Objects;

public class Magazine extends Text {
    int volume;
    int year;

    public Magazine(String name, Client author, double price, int volume, int year) {
        super(name, author, price);
        this.volume = volume;
        this.year = year;
    }

    public int getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return volume == magazine.volume &&
                year == magazine.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume, year);
    }
}
