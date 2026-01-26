package Level1.exercise1;

import java.util.Objects;

public class Libro {

    private String title;
    private String genre;

    public Libro (String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(title, libro.title) &&
                Objects.equals(genre, libro.genre);
    }


    @Override
    public String toString() {
        return "Libro{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
