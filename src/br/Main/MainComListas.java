package br.Main;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {


        Movie movie1 = new Movie("O poderoso chefão", 1970);

        Movie movie2 = new Movie("Avatar", 2023);

        Movie movie3 = new Movie("Dogville", 2003);

        Series lost = new Series("lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(movie1);
        lista.add(movie2);
        lista.add(movie3);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getTitle());
            if (item instanceof Movie filme && filme.getClassificacao() > 2) {
                System.out.println("classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Addam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jacqueline");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("depois da ordenação:");
        System.out.println(buscarPorArtista);

        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparingDouble(Titulo::getReleaseDate));
        System.out.println("Ordenando por ano");
        System.out.println(lista);




    }
}