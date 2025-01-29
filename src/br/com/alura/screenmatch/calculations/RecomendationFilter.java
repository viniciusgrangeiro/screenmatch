package br.com.alura.screenmatch.calculations;

/**Classe para objetos do tipo RecomendationFilter, onde existira apenas um metodo.
 * @author Vinicius Grangeiro
 * @version 1.0
 * @since Release 0 a aplicação
 */


public class RecomendationFilter {

    /**Metodo para filtrar um titulo e informar se ele é bem avaliado
     *
     * Este metodo ira filtrar um título "Classificavel"
     * Dependendo do título, ele tera seu metodo de getClassification,
     * que por sua vez, retornara um valor de avaliacao
     *
     * @author Vinicius Grangeiro
     * @param classifiable Classifiable - Titulo classificavel
     * @return String - Imprime a classificacao do titulo
     */
    public void filterTitle(Classifiable classifiable){
        if (classifiable.getClassification() >= 4){
            System.out.println("Esta entre os preferidos da plataforma");
        } else if (classifiable.getClassification() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para ver depois");
        }
    }
}
