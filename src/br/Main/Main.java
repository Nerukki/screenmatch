package br.Main;

import br.alura.com.screenmatch.calculos.CalculadoraDeTempo;
import br.alura.com.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("O poderoso chefão", 1970);
        //movie1.setTitle("O poderoso chefão");
        //movie1.setReleaseDate(1970);
        movie1.setTimeInMinutes(180);
        System.out.println("duração do filme: " + movie1.getTimeInMinutes());


        movie1.showDatasheet();

        movie1.rate(8);
        movie1.rate(5);
        movie1.rate(10);


        System.out.println("tatal de avaliações: " + movie1.getAmountOfRating());
        System.out.println(movie1.getAvaregeRating());

        //System.out.println(movie1.totalRating);
        //System.out.println(movie1.amountOfRating);


        Series lost = new Series("lost", 2000);
//        lost.setTitle("Lost");
//        lost.setReleaseDate(2000);
        lost.showDatasheet();
        lost.setSeasons(10);
        lost.setSeasonsEpisodes(10);
        lost.setEpisodeMinutes(50);
        System.out.println("duração da série: " + lost.getTimeInMinutes());



        Movie movie2 = new Movie("Avatar", 2023);
        //movie2.setTitle("Avatar");
        //movie2.setReleaseDate(2023);
        movie2.setTimeInMinutes(200);



        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(movie1);
        calculadora.inclui(movie2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(movie1);

        Episodio episodio1DeLost  = new Episodio();
        episodio1DeLost.setNumero(1);
        episodio1DeLost.setSerie(lost);
        episodio1DeLost.setTotalVisualizacoes(300);
        filtro.filtra(episodio1DeLost);


        Movie movie3 = new Movie("Dogville", 2003);
        //movie3.setReleaseDate(2003);
        movie3.setTimeInMinutes(200);


        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(movie1);
        listaDeFilmes.add(movie2);
        listaDeFilmes.add(movie3);
        System.out.println("tamanho da lista: " + listaDeFilmes.size());
        System.out.println("primeiro filme: " + listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());



    }
}
