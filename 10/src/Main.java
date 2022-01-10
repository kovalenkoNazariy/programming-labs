import database.Actor;
import database.MovieDB;

import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
        MovieDB movieDB = new MovieDB();
        {
            TreeSet<String> meltdownActorNames = new TreeSet<>();
            meltdownActorNames.add("Milton McIlroy");
            meltdownActorNames.add("John Cohn");
            meltdownActorNames.add("Theodore Bickford");
            meltdownActorNames.add("Charlie Fleming");
            meltdownActorNames.add("Chippy");
            meltdownActorNames.add("Leo Hornstein");

            movieDB.addMovie("Meltdown", meltdownActorNames);

            TreeSet<String> testActorNames = new TreeSet<>();
            testActorNames.add("Leo Hornstein");
            testActorNames.add("Testman");
            movieDB.addMovie("Test", testActorNames);

            TreeSet<String> test2ActorNames = new TreeSet<>();

            test2ActorNames.add("Testactor");
            movieDB.addMovie("Test2", test2ActorNames);

            for (Actor a : movieDB.getActorsColleagues("Leo Hornstein")) {
                System.out.println(a.toString());
            }

            movieDB.addActor("Noone");
        }

        System.out.println(movieDB.hasActorWithNoMovies());

        System.out.println(movieDB.getMovieWithMostActors());
    }
}
