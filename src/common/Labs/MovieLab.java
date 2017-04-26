/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.Labs;

import common.Movie;
import java.util.*;

/**
 *
 * @author jerem
 */
public class MovieLab {

    public static void main(String[] args) {

        Movie dieHard = new Movie(7985, "Die Hard", "John McTiernan", "1988");
        Movie dieHard2 = new Movie(7986, "Die Hard 2", "John McTiernan", "1990");
        Movie dieHardWithVengence = new Movie(7987, "Die Hard with a Vengeance", "John McTiernan", "1995");
        Movie aGoodDayToDieHard = new Movie(7985, "A Good Day to Die Hard", "John McTiernan", "2013");

        Map<Integer, Movie> map = new HashMap<>();
        map.put(dieHard.getMovieID(), dieHard);
        map.put(dieHard2.getMovieID(), dieHard2);
        map.put(dieHardWithVengence.getMovieID(), dieHardWithVengence);
        map.put(aGoodDayToDieHard.getMovieID(), aGoodDayToDieHard);

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Movie found = map.get(key);
            System.out.println(found.toString());
            System.out.println("");

        }
        
        System.out.println("");
        System.out.println("");
        
        
        Map<Integer, Movie> map2 = new TreeMap<>();
        map2.put(dieHard.getMovieID(), dieHard);
        map2.put(dieHard2.getMovieID(), dieHard2);
        map2.put(dieHardWithVengence.getMovieID(), dieHardWithVengence);
        map2.put(aGoodDayToDieHard.getMovieID(), aGoodDayToDieHard);
        
        Set<Integer> keys2 = map2.keySet();
        for(Integer key : keys2) {
            Movie found = map.get(key);
            System.out.println(found.toString());
            System.out.println("");
        }
            
        System.out.println("");
        System.out.println("");
        
        Collection<Movie> movies = map2.values();
        // Now put in List because Collections.sort reuquires it...
        List<Movie> list = new ArrayList<>(movies);
        // Now use the utility class to perform the sort using the
        // natural order (Comparable) of the entity object
        Collections.sort(list);
        for(Movie m : list) {
            System.out.println(m);
            System.out.println("");
        }
            
        System.out.println("");
        System.out.println("");
        
        Collection<Movie> movies2 = map2.values();
        List<Movie> list2 = new ArrayList<>(movies2);
        Collections.sort(list2, new MovieByReleaseYear());
        for(Movie m : list2) {
            System.out.println(m);
            System.out.println("");
        }
        
    }
}
