package database;

import java.util.Comparator;

public class ActorComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getName().compareTo(o2.getName()) * -1;
    }
}
