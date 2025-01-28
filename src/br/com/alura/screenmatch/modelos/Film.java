package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculations.Classifiable;

// Todo Filme "é um" Title
// Implementa a interface Classifiable
public class Film extends Title implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) takeMedia() / 2;
    }
}
