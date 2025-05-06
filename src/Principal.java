import br.com.livia.screenmatch.calculos.CalculadoraDeTempo;
import br.com.livia.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.livia.screenmatch.modelos.Episodio;
import br.com.livia.screenmatch.modelos.Filme;
import br.com.livia.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(2020);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
//        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new  Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemportada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar sua serie: " + serie.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Avatar");
        meuFilme2.setAnoDeLancamento(2023);
        meuFilme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}