/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.Labs;

import common.Movie;
import java.util.Comparator;

/**
 *
 * @author jerem
 */
public class MovieByReleaseYear implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getReleaseYear().compareTo(m2.getReleaseYear());
    }
}