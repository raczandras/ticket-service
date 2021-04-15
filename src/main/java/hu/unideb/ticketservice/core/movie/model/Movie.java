package hu.unideb.ticketservice.core.movie.model;

import java.util.Objects;

public class Movie {

    private final String name;
    private final String genre;
    private final int length;

    public Movie(String name, String genre, int length) {
        this.name = name;
        this.genre = genre;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return length == movie.length &&
                name.equals(movie.name) &&
                genre.equals(movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, length);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

}
