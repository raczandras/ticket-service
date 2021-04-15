package hu.unideb.ticketservice.core.room.model;

import java.util.Objects;

public class Room {
    private final String name;
    private final int rows;
    private final int columns;

    public Room(String name, int rows, int columns) {
        this.name = name;
        this.rows = rows;
        this.columns = columns;
    }

    public String getName() {
        return name;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return rows == room.rows &&
                columns == room.columns &&
                name.equals(room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rows, columns);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }

    public static class Builder {
        private String name;
        private int rows;
        private int columns;

        public Room.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Room.Builder withRows(int rows) {
            this.rows = rows;
            return this;
        }

        public Room.Builder withColumns(int columns) {
            this.columns = columns;
            return this;
        }

        public Room build() {
            return new Room(name, rows, columns);
        }
    }

}
