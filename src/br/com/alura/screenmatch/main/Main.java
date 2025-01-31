package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Generate a new Film
        Film myFilm1 = new Film("O Poderoso Chefão", 1970);
        myFilm1.setDurationInMinutes(180);
        myFilm1.evaluate(10);
        myFilm1.evaluate(5);
        myFilm1.evaluate(0);

        Film myFilm2 = new Film("Senhor dos Anéis", 2001);
        myFilm2.setDurationInMinutes(180);
        myFilm2.evaluate(10);
        myFilm2.evaluate(7);
        myFilm2.evaluate(4);

        Film myFilm3 = new Film("Star Wars", 1978);
        myFilm3.setDurationInMinutes(120);
        myFilm3.evaluate(6);
        myFilm3.evaluate(7);
        myFilm3.evaluate(4);

        // Criando um ArrayList para guardar filmes
        ArrayList<Film> filmList = new ArrayList<>();
        // Adicionando filmes a lista
        filmList.add(myFilm1);
        filmList.add(myFilm2);
        filmList.add(myFilm3);

        System.out.println("Tamanho da lista: " + filmList.size());

        // filmList.get(0) - retorna myFilm1, por isso podemos usar .getName()
        // resumindo myFilm1.getNome() - retorna "O Poderoso Chefão"
        System.out.println("Primeiro item da lista: " + filmList.get(0).getName());
        System.out.println(filmList);
        System.out.println("toString do filme: " + filmList.get(0).toString());


//        double averageFilm = myFilm1.takeMedia();

        // Este bloco exibe sinopse e a nota do filme
//        myFilm1.showSynopsis();
//        System.out.println(averageFilm);

//        Generate a new Serie
        Serie mySerie = new Serie("Breaking Bad", 2010);
        mySerie.setSeasons(10);
        mySerie.setEpisodesForSeason(10);
        mySerie.setMinutesForEpisode(50);
        mySerie.evaluate(10);
        mySerie.evaluate(4);
        mySerie.evaluate(4);

//        double averageSerie = mySerie.takeMedia();

//        Este bloco exibe a sinopse da serie e a duracao total da serie
//        mySerie.showSynopsis();
//        System.out.println(averageSerie);
//        System.out.println("Para maratonar " + mySerie.getName() + " serão necessários " + mySerie.getDurationInMinutes() + " minutos");

//        Usando uma calculadora para calcular o tempo de sessao do filme + serie
//        CalculatorOfTime calculator = new CalculatorOfTime();
//        calculator.include(myFilm1);
//        calculator.include(mySerie);
//        int totalTime = calculator.getTotalTime();
//        System.out.println(totalTime);

//        Fazendo um filtro de recomendação
//        RecomendationFilter filter = new RecomendationFilter();
//        filter.filterTitle(myFilm1);
//
//        Episode episode = new Episode();
//        episode.setNumber(1);
//        episode.setSerie(mySerie);
//        episode.setTotalViews(300);
//
//        filter.filterTitle(episode);
    }
}
