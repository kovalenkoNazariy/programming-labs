package db;

import exceptions.InvalidActorException;
import exceptions.InvalidMovieException;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeMap;

public class MovieDB {
    private final TreeMap<Movie, HashSet<Actor>> movieActorMap = new TreeMap<>();
    private final TreeMap<Actor, HashSet<Movie>> actorMovieMap = new TreeMap<>();

    public void addMovie(String movieTitle, HashSet<String> actorNames) throws InvalidActorException, InvalidMovieException {
        if(movieTitle.isEmpty())
            throw new InvalidMovieException();

        for(String s : actorNames){
            if(s.isEmpty())
                throw new InvalidActorException();
        }

        Movie movie = new Movie(movieTitle);
        HashSet<Actor> actors = new HashSet<>();

        for(String s : actorNames){
            actors.add(new Actor(s));
        }

        movieActorMap.put(movie, actors);

        for(Actor a : actors){
            if(!actorMovieMap.containsKey(a)){
                HashSet<Movie> set = new HashSet<>();
                set.add(movie);
                actorMovieMap.put(a, set);
            }else{
                actorMovieMap.get(a).add(movie);
            }
        }
    }

    public void addActor(String actorName) throws InvalidActorException {
        if(actorName.isEmpty())
            throw new InvalidActorException();

        actorMovieMap.put(new Actor(actorName), new HashSet<>());
    }

    public boolean hasActorWithNoMovies(){
        for(Actor a : actorMovieMap.descendingKeySet()){
            if(actorMovieMap.get(a).size() == 0)
                return true;
        }

        return false;
    }

    public HashSet<Actor> getActorsColleagues(String actorName){
        if(actorName == null)
            throw new NullPointerException();

        Actor actor = new Actor(actorName);

        HashSet<Actor> actorSet = new HashSet<>();

        HashSet<Movie> movieSet = actorMovieMap.get(actor);

        for(Movie m : movieSet){
            actorSet.addAll(movieActorMap.get(m));
        }

        return actorSet;
    }

    public Movie getMovieWithMostActors(){
        Movie fMovie = null;
        int mostActors = 0;

        for(Movie m : movieActorMap.descendingKeySet()){
            HashSet<Actor> actors = movieActorMap.get(m);

            int size = actors.size();

            if(size > mostActors){
                fMovie = m;
                mostActors = size;
            }
        }

        return fMovie;
    }

    public String getMoviesString(){
        StringBuilder movies = new StringBuilder("Movies{\n");
        NavigableSet<Movie> list = movieActorMap.descendingKeySet();

        for(Movie m : list){
            movies.append('\t').append(m.getTitle()).append("{\n");

            for(Actor a : movieActorMap.get(m)){
                movies.append("\t\t").append(a.getName()).append(",\n");
            }

            movies.append("\t}");

            if(m != list.last())
                movies.append(",\n\n");
            else
                movies.append("\n");
        }

        return movies.append('}').toString();
    }
}
