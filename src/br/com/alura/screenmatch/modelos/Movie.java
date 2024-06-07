package br.com.alura.screenmatch.modelos;

import br.alura.com.screenmatch.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;

    public Movie(String title, int releaseDate) {
        super(title, releaseDate);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getAvaregeRating() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getTitle() + " (" + getReleaseDate() + ")";
    }
}
