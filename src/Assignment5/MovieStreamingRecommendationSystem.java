package Assignment5;
import java.util.*;

class Movie {
    String title;
    double rating;
    
    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }
    
    @Override
    public String toString() {
        return title + " - Rating: " + rating;
    }
}

public class MovieStreamingRecommendationSystem {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Bahubali", 8.8),
            new Movie("Salaar", 8.6),
            new Movie("Game Changer", 9.0),
            new Movie("kgf2", 7.4)
        );
        
        System.out.println("Top Rated Movies:");
        movies.stream()
            .sorted(Comparator.comparingDouble(m -> -m.rating))
            .forEach(System.out::println);
        
        System.out.println("\nMovies with Rating above 8.5:");
        movies.stream()
            .filter(m -> m.rating > 8.5)
            .forEach(System.out::println);
    }
}