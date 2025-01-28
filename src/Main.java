import br.com.alura.screenmatch.calculations.CalculatorOfTime;
import br.com.alura.screenmatch.calculations.RecomendationFilter;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        // Generate a new Film
        Film myFilm = new Film();
        myFilm.setName("O Poderoso Chefão");
        myFilm.setYearOfRelease(1970);
        myFilm.setDurationInMinutes(180);
        myFilm.calculateEvaluation(10);
        myFilm.calculateEvaluation(5);
        myFilm.calculateEvaluation(0);

        double averageFilm = myFilm.takeMedia();

        myFilm.showSynopsis();
        System.out.println(averageFilm);

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

        mySerie.showSynopsis();
        System.out.println(averageSerie);
        System.out.println("Para maratonar " + mySerie.getName() + " serão necessários " + mySerie.getDurationInMinutes() + " minutos");

        // Usando uma calculadora para calcular o tempo de sessao do filme + serie
        CalculatorOfTime calculator = new CalculatorOfTime();
        calculator.include(myFilm);
        calculator.include(mySerie);
        int totalTime = calculator.getTotalTime();
        System.out.println(totalTime);

        // Fazendo um filtro de recomendação
        RecomendationFilter filter = new RecomendationFilter();
        filter.filterTitle(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(mySerie);
        episode.setTotalViews(300);

        filter.filterTitle(episode);
    }
}
