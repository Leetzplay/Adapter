package padroesestruturais.adapter;

public class Player {

    IEstatistica avaliacao;
    AdapterBrawler adapterbrawler;

    public Player() {
        avaliacao = new DesempenhoBrawler();
        adapterbrawler = new AdapterBrawler(avaliacao);
    }

    public void setAvaliacao(String brawler) {
        avaliacao.setEstatistica(brawler);
        adapterbrawler.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return adapterbrawler.recuperarAvaliacao();
    }
    public float getResultado() {
        return adapterbrawler.getResultado();
    }

}
