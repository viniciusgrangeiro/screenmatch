package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculations.Classifiable;

/**Superclasse para objetos do tipo Titulo, onde serão contidos, valores e métodos para o mesmo.
 * @author Vinicius Grangeiro
 * @version 1.0
 * @since Release 0 a aplicação
 */


// Todo Filme "e um" Title
// Implementa a interface Classifiable
public class Film extends Title implements Classifiable {
    private String director;

    // Criando um Construtor, ele deve ter o mesmo nome da Classe
    public Film (String name, int yearOfRelease){

        super(name, yearOfRelease);
    }

    public String getDirector() {

        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    @Override
    public int getClassification() {

        return (int) calculateEvaluation() / 2;
    }

    // Estamos reescrevendo o metodo toString
    @Override
    public String toString() {

        return "Filme: " + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}
