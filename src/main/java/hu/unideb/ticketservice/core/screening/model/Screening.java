package hu.unideb.ticketservice.core.screening.model;

import hu.unideb.ticketservice.core.movie.model.Movie;
import hu.unideb.ticketservice.core.room.model.Room;

import java.util.Objects;

public class Screening {

    private final Movie movie;
    private final Room room;

    public Screening(Movie movie, Room room) {
        this.movie = movie;
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Screening screening = (Screening) o;
        return movie.equals(screening.movie) &&
                room.equals(screening.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, room);
    }

    @Override
    public String toString() {
        return "Screening{" +
                "movie=" + movie.toString() +
                ", room=" + room.toString() +
                '}';
    }

    public static class Builder {
        private Movie movie;
        private Room room;

        public Screening.Builder witMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public Screening.Builder withRoom(Room room) {
            this.room = room;
            return this;
        }

        public Screening build() {
            return new Screening(movie, room);
        }
    }
}
