import db.Actor;
import db.MovieDB;
import exceptions.InvalidActorException;
import exceptions.InvalidMovieException;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        /*int[] array = new int[]{3, 5};

        try{
            array[5] = 3;
        }catch(ArrayIndexOutOfBoundsException e){
            System.exit(0);
        }finally{
            System.out.println("test");
        }*/

        MovieDB movieDB = new MovieDB();

        HashSet<String> meltdownActorNames = new HashSet<>();
        meltdownActorNames.add("Milton McIlroy");
        meltdownActorNames.add("John Cohn");
        meltdownActorNames.add("Theodore Bickford");
        meltdownActorNames.add("Charlie Fleming");
        meltdownActorNames.add("Chippy");
        meltdownActorNames.add("Leo Hornstein");

        HashSet<String> testActorNames = new HashSet<>();
        testActorNames.add("Leo Hornstein");
        testActorNames.add("Testman");

        HashSet<String> test2ActorNames = new HashSet<>();

        test2ActorNames.add("Testactor");

        try{
            movieDB.addMovie("Meltdown", meltdownActorNames);
            movieDB.addMovie("Test", testActorNames);
            movieDB.addMovie("Test2", test2ActorNames);
            movieDB.addActor("Noone");
        }catch(InvalidActorException | InvalidMovieException e){
            if(e instanceof InvalidActorException){
                System.err.println("Exception caught while adding an actor. Is their name empty?");
            }else{
                System.err.println("Exception caught while adding a movie. Is it's title empty?");
            }
        }finally{
            //this is useless here so its gonna be empty
        }

        try{
            movieDB.addActor("");
        }catch(InvalidActorException e){
            System.err.println("Exception caught while adding an actor. Is their name empty?");
        }

        try{
            movieDB.addMovie("", new HashSet<>());
        }catch(InvalidActorException | InvalidMovieException e){
            if(e instanceof InvalidActorException){
                System.err.println("Exception caught while adding an actor. Is their name empty?");
            }else{
                System.err.println("Exception caught while adding a movie. Is it's title empty?");
            }
        }

        for (Actor a : movieDB.getActorsColleagues("Leo Hornstein")) {
            System.out.println(a.toString());
        }

        try{
            movieDB.getActorsColleagues(null);
        }catch(NullPointerException e){
            System.err.println(e.getMessage());
        }

        System.out.println(movieDB.hasActorWithNoMovies());

        System.out.println(movieDB.getMovieWithMostActors());

        System.out.println("\n" + movieDB.getMoviesString());
    }
}
