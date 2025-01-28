package br.com.alura.screenmatch.calculations;

// Sempre que um objeto implementa essa interface, ele automaticamente
// se torna um "Classifiable" e devera implementar o metodo getClassification
//
// Para cada objeto, esse metodo sera @Override, pois funcionara de uma forma
// diferente dependendo do objeto
public interface Classifiable {
    int getClassification();
}
