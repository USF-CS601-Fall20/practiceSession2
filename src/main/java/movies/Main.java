package movies;


public class Main {
    public static void main(String[] args) {
        // FILL IN CODE:
        // Open the file given by the first command line argument
        // Parse it and load data into Movies

        // Allow the user to type the name of the director (use Scanner)
        // and show all movies by this director
        // The search should be efficient.
        // Movie should be sorted by year (in ascending order)
        Movies movies = new Movies();
        movies.loadMovies(args[0]);
    }
}
