import br.com.alura.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("O poderoso chefão");
        movie1.setReleaseDate(1970);
        movie1.setTimeInMinutes(180);


        movie1.showDatasheet();

        movie1.rate(8);
        movie1.rate(5);
        movie1.rate(10);


        System.out.println("tatal de avaliações: " + movie1.getAmountOfRating());
        System.out.println(movie1.getAvaregeRating());

        //System.out.println(movie1.totalRating);
        //System.out.println(movie1.amountOfRating);

    }
}
