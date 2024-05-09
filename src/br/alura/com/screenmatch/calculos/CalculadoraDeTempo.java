package br.alura.com.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Movie f){
//        this.tempoTotal += f.getTimeInMinutes();
//    }
//
//    public void inclui(Series f){
//        this.tempoTotal += f.getTimeInMinutes();
//    }


    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getTimeInMinutes();
    }
}