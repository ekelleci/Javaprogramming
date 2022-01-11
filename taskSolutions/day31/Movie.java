package taskSolutions.day31;
import day31_CustomClassConstructor.ScrumTest.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    /*
    3. Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

    */
    /*3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie

     */
    //Attributes
    public String   country, title, Genre, releaseDate, director , cast;

    //Contractor
    public Movie(String country, String title, String genre, String releaseDate, String director, String cast) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.cast = cast;
    }

    //addCast(String): adds the given string argument to the arrayList casts
    public  ArrayList<String> Casts = new ArrayList<>();

    public void addCast(String cast){
                Casts.add(cast);
    }
   //addCasts(String[]): adds the given string array argument to the arrayList casts

    public void addCast(String [] cast){
        Casts.addAll(Arrays.asList(cast));
    }

    // toString(): returns the name of country, title, release date, and total number of casts


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", Casts=" + Casts.size() +
                '}';
    }
}
