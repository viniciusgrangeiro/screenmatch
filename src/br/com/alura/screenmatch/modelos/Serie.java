package br.com.alura.screenmatch.modelos;

// Toda Serie "é um" Title
public class Serie extends Title{
    private int seasons;
    private boolean active;
    private int episodesForSeason;
    private int minutesForEpisode;

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

    public int getEpisodesForSeason() {
        return episodesForSeason;
    }

    public void setEpisodesForSeason(int episodesForSeason) {
        this.episodesForSeason = episodesForSeason;
    }

    public int getMinutesForEpisode() {
        return minutesForEpisode;
    }

    public void setMinutesForEpisode(int minutesForEpisode) {
        this.minutesForEpisode = minutesForEpisode;
    }

    @Override // Sobrescrever um metodo, ele ja existe na classe titulo, mas vamos altera-lo
    public int getDurationInMinutes() {
        return seasons * episodesForSeason * minutesForEpisode;
    }
}
