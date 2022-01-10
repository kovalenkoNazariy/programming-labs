package database;

import java.util.TreeSet;

public class Movie implements Comparable<Movie> {
    private final String title;
    protected TreeSet<Actor> actors = new TreeSet<>();

    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie movie) {
        return title.compareTo(movie.title);
    }
}
