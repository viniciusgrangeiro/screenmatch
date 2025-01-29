package br.com.alura.screenmatch.modelos;

/**Classe para objetos do tipo Funcionários, onde serão contidos, valores e métodos para o mesmo.
 * @author Vinicius Grangeiro
 * @version 1.0
 * @since Release 0 a aplicação
 */

public class Title implements Comparable<Title>{
    private String name;
    private int yearOfRelease;
    private boolean plusSubscription;
    private double sumOfRatings;
    private int totalReviews;
    private int durationInMinutes;

    /** Construtor de Title
     *
     * @param name String - que recebe o nome do Titulo
     * @param yearOfRelease int - que recebe o ano de lancamento
     */

    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    /** Método para retorno do nome do Titulo
     * @return name - Nome do titulo*/

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isPlusSubscription() {
        return plusSubscription;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // Metodos Set sao usados para setar valor a algum atributo que esta privado

    public void setName(String name){
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setPlusSubscription(boolean plusSubscription) {
        this.plusSubscription = plusSubscription;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showSynopsis(){
        // Sempre que um metodo não retorna nada, ele sera "VOID"
        // Metodo para exibir a sinopse do filme
        System.out.println("Name of the title: " + name);
        System.out.println("Year of Release: " + yearOfRelease);
    }

    public void evaluate(double rating){
        // Metodo para setar Nota
        sumOfRatings += rating;
        totalReviews++;
    }

    public double calculateEvaluation(){
        // Metodo para pegar Media das avaliacoes
        // Esse metodo retorna um double, por isso "DOUBLE"
        return sumOfRatings / totalReviews;
    }

    // Precisamos reescrever o metodo compareTo, pois ele não compara Objetos Titulos

    /** Este motodo compara Titulos
     *
     * @param otherTitle the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
