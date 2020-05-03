package library;

//Consideracion: Creo esta clase para no guardar strings en cada cliente del sistema, sino referencias a instancias que
//muy probablemente sean comunes a todos los usuarios.

import java.util.Objects;

public class Genre {
    String genre;

    public Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre1 = (Genre) o;
        return Objects.equals(genre, genre1.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre);
    }
}
