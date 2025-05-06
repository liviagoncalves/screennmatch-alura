package br.com.livia.screenmatch.calculos;

import br.com.livia.screenmatch.modelos.Filme;
import br.com.livia.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
