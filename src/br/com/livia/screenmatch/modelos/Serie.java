package br.com.livia.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemportada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemportada() {
        return episodiosPorTemportada;
    }

    public void setEpisodiosPorTemportada(int episodiosPorTemportada) {
        this.episodiosPorTemportada = episodiosPorTemportada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemportada * minutosPorEpisodio;
    }
}
