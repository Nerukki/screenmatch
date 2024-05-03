package br.com.alura.screenmatch.modelos;

public class Series extends Titulo {

    private int seasons;
    private boolean active;
    private int seasonsEpisodes;
    private int episodeMinutes;


    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSeasonsEpisodes() {
        return seasonsEpisodes;
    }

    public void setSeasonsEpisodes(int seasonsEpisodes) {
        this.seasonsEpisodes = seasonsEpisodes;
    }

    public int getEpisodeMinutes() {
        return episodeMinutes;
    }

    public void setEpisodeMinutes(int episodeMinutes) {
        this.episodeMinutes = episodeMinutes;
    }

    @Override
    public int getTimeInMinutes(){
        return seasons * seasonsEpisodes * episodeMinutes;
    }
}
