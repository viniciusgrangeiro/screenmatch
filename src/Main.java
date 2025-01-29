import br.com.alura.screenmatch.calculations.CalculatorOfTime;
import br.com.alura.screenmatch.calculations.RecomendationFilter;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Generate a new Film
        Film myFilm1 = new Film();
        myFilm1.setName("O Poderoso Chefão");
        myFilm1.setYearOfRelease(1970);
        myFilm1.setDurationInMinutes(180);
        myFilm1.calculateEvaluation(10);
        myFilm1.calculateEvaluation(5);
        myFilm1.calculateEvaluation(0);

        Film myFilm2 = new Film();
        myFilm2.setName("Senhor dos Anéis");
        myFilm2.setYearOfRelease(2001);
        myFilm2.setDurationInMinutes(180);
        myFilm2.calculateEvaluation(10);
        myFilm2.calculateEvaluation(7);
        myFilm2.calculateEvaluation(4);

        Film myFilm3 = new Film();
        myFilm3.setName("Star Wars");
        myFilm3.setYearOfRelease(1978);
        myFilm3.setDurationInMinutes(120);
        myFilm3.calculateEvaluation(6);
        myFilm3.calculateEvaluation(7);
        myFilm3.calculateEvaluation(4);

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


        double averageFilm = myFilm1.takeMedia();

        // Este bloco exibe sinopse e a nota do filme
//        myFilm1.showSynopsis();
//        System.out.println(averageFilm);

        // Generate a new Serie
        Serie mySerie = new Serie();
        mySerie.setName("Breaking Bad");
        mySerie.setYearOfRelease(2010);
        mySerie.setSeasons(10);
        mySerie.setEpisodesForSeason(10);
        mySerie.setMinutesForEpisode(50);
        mySerie.calculateEvaluation(10);
        mySerie.calculateEvaluation(4);
        mySerie.calculateEvaluation(4);

        double averageSerie = mySerie.takeMedia();

//        Este bloco exibe a sinopse da serie e a duracao total da serie
//        mySerie.showSynopsis();
//        System.out.println(averageSerie);
//        System.out.println("Para maratonar " + mySerie.getName() + " serão necessários " + mySerie.getDurationInMinutes() + " minutos");

        // Usando uma calculadora para calcular o tempo de sessao do filme + serie
//        CalculatorOfTime calculator = new CalculatorOfTime();
//        calculator.include(myFilm1);
//        calculator.include(mySerie);
//        int totalTime = calculator.getTotalTime();
//        System.out.println(totalTime);

        // Fazendo um filtro de recomendação
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
