package taskSolutions.day31;

public class MovieObject {
    public static void main(String[] args) {
        /*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie

         */

        Movie KuzularinSessizligi=new Movie("Turkey","Kuzularin Sessizligi","Kelleci roduction"," 02/09/2023","EmreKelleci",
                "Yigit");



        System.out.println(KuzularinSessizligi);
    }
}
