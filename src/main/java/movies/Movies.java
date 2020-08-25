package movies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/** A class that represents a collection of movies. */
public class Movies {

    private List<Movie> movies; // list of movies
    private Map<String, SortedSet<Movie>> moviesMap; // a map that maps a director to the set of movies they directed

    public Movies() {
        // todo: initialize a list and a map
    }

    // FILL IN CODE
    // Read movie data from the given file.
    // Store information about movies in a map where the key is the name of the director,
    // and the value is a set of movies they directed
    public void loadMovies(String file) {
        // todo

    }


    /**
     * Returns a set of an immutable set of movies directed by the given director
     * @param director
     * @return
     */
    public SortedSet<Movie> getMovies(String director) {
        //todo

        return null; // change
    }

    public String toString() {
        //todo: use StringBuilder. Return a string that contains all the movies
        return ""; // change
    }
}
