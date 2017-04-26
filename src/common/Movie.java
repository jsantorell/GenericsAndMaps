package common;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie  implements Comparable<Movie> {
    private int movieID;
    private String title;
    private String director;
    private String releaseYear;

    public Movie(int movieID, String title, String director, String releaseYear) {
        this.movieID = movieID;
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int MovieID) {
        this.movieID = MovieID;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (this.movieID != other.getMovieID()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.movieID;
        return hash;
    }

       @Override
    public String toString() {
        return "Movie ID: " + movieID + "\nTitle: " + title + "\nDirector: " + director + "\nRelease Year: " + releaseYear;
    }

    @Override
    public int compareTo(Movie t) {

        return new CompareToBuilder().append(this.movieID, t.movieID).toComparison();

    }

}
