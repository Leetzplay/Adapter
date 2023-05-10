package padroesestruturais.adapter;

public class DesempenhoBrawler implements IEstatistica {

    private String brawler;

    @Override
    public String getEstatistica() {
        return this.brawler;
    }

    @Override
    public void setEstatistica(String brawler) {
        this.brawler = brawler;
    }
}
