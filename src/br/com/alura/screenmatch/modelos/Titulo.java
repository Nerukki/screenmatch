package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String title;
    private int releaseDate;
    private boolean planIncluded;
    private double totalRating;
    private int amountOfRating;
    private int timeInMinutes;

    public Titulo(String title, int releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.title = meuTituloOmdb.title();
        this.releaseDate = Integer.valueOf(meuTituloOmdb.year());
        this.timeInMinutes = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public int getAmountOfRating(){
        return amountOfRating;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void showDatasheet(){
        System.out.println("Nome do filme: " + title);
        System.out.println("Data de lançamento: " + releaseDate);
        System.out.println("Duração em minutos: " + timeInMinutes);
        System.out.println("Incluido no plano: " + planIncluded);


    }

    public void rate (double rating){
        totalRating += rating;
        amountOfRating++;

    }

    public double getAvaregeRating(){
        return totalRating / amountOfRating;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getTitle().compareTo(outroTitulo.getTitle());
    }


    @Override

    public String toString() {
        return "nome: " + title + ", anoDeLancamento: " + releaseDate + "," + " duração: " + timeInMinutes;
    }
}

