package br.com.alura.screenmatch.calculations;

public class RecomendationFilter {

    // Este metodo ira filtrar um título "Classificavel"
    // Dependendo do título, ele tera seu metodo de getClassification,
    // que por sua vez, retornara um valor de avaliacao
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
