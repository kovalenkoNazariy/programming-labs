package database;

import java.util.Objects;
import java.util.TreeSet;

public class Actor implements Comparable<Actor> {
    private final String name;
    protected TreeSet<Movie> movies = new TreeSet<>();

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Actor actor) {
        return name.compareTo(actor.name);
    }
}