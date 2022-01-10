package database;

import java.util.Iterator;
import java.util.TreeSet;

public class MovieDB {
    private final TreeSet<Actor> actors = new TreeSet<>(new ActorComparator());
    private final TreeSet<Movie> movies = new TreeSet<>();

    public void addMovie(String movieName, TreeSet<String> actorNames){
        Movie movie = new Movie(movieName);

        for(String actorName : actorNames) {
            movie.actors.add(new Actor(actorName));
        }

        movies.add(movie);
        for(Actor actor : movie.actors){
            boolean actorFound = false;
            for(Actor actorInActors : actors){
                if(actorInActors.equals(actor)){
                    actorInActors.movies.add(movie);
                    actorFound = true;
                    break;
                }
            }

            if(!actorFound){
                actors.add(actor);
            }

            actor.movies.add(movie);
        }
    }

    public void addActor(String actorName){
        actors.add(new Actor(actorName));
    }

    public boolean hasActorWithNoMovies(){
        Iterator iterator = actors.iterator();

        while(iterator.hasNext()){
            Object o = iterator.next();

            if(!(o instanceof Actor))
                continue;

            if(((Actor)o).movies.size() == 0)
                return true;
        }

        return false;
    }

    public TreeSet<Actor> getActorsColleagues(String actorName){
        Actor actor = null;
        for(Actor actor1 : actors){
            if(actorName.equals(actor1.getName())){
                actor = actor1;
            }
        }

        TreeSet<Actor> colleagues = new TreeSet<>();

        if (actor == null)
            return colleagues;

        for(Movie movie : actor.movies){
            for(Actor potentialColleague : movie.actors){
                if(!colleagues.contains(potentialColleague) && !potentialColleague.equals(actor)){
                    colleagues.add(potentialColleague);
                }
            }
        }

        return colleagues;
    }

    public Movie getMovieWithMostActors(){
        Iterator<Movie> movieIterator = movies.iterator();

        Movie result = null;

        while(movieIterator.hasNext()){
            Movie movie = movieIterator.next();

            if (movie.actors.size() > (result == null ? 0 : result.actors.size())){
                result = movie;
            }
        }

        return result;
    }
}
