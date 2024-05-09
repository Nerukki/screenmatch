package br.alura.com.screenmatch.calculos;

public class FiltroDeRecomendacao {


    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta nos favoritos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para ver depois");
        }
    }
}
