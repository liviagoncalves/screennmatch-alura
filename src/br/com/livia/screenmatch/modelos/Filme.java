package br.com.livia.screenmatch.modelos;

import br.com.livia.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private  String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
