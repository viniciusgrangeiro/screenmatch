package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.modelos.Title;

public class CalculatorOfTime {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    // Esse metodo adiciona um titulo para o calculo da duracao
    public void include(Title title){
        this.totalTime += title.getDurationInMinutes();
    }
}
