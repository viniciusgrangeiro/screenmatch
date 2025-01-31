package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {

        Film myFilm1 = new Film("O Poderoso Chefão", 1970);
        myFilm1.evaluate(8);
        Film myFilm2 = new Film("Senhor dos Anéis", 2001);
        myFilm2.evaluate(7);
        Film myFilm3 = new Film("Star Wars", 1978);
        myFilm3.evaluate(9);
        Serie mySerie1 = new Serie("Breaking Bad", 2010);

        // Criando um ArrayList para guardar filmes
        List<Title> list = new ArrayList<>();
        // Adicionando filmes a lista
        list.add(myFilm1);
        list.add(myFilm2);
        list.add(myFilm3);
        list.add(mySerie1);

        // Percorre a lista para cada item da lista
        for (Title iten : list) {
            System.out.println(iten.getName());

            if (iten instanceof Film film) {
                System.out.println("Classificacao " + film.getClassification());
            }

        }

        List<String> searchForArtist = new LinkedList<>();
        searchForArtist.add("Marlon Brando");
        searchForArtist.add("Tom Hanks");
        searchForArtist.add("Adam Sandler");
        System.out.println(searchForArtist);

        Collections.sort(searchForArtist);
        System.out.println("Depois da ordenacao");
        System.out.println(searchForArtist);

        System.out.println("Lista de Titulo ordenada com sort()");
        Collections.sort(list);
        System.out.println(list);

        // Todo titulo ele devera usar o getYearOfRelease para comparar
        list.sort(Comparator.comparing(Title::getYearOfRelease));

        System.out.println("Ordenando por ano: " + list);
    }
}
