package padroesestruturais.adapter;

public class AdapterBrawler extends ResultadoBrawler {

    private IEstatistica avaliacaoDesempenho;

    public AdapterBrawler(IEstatistica avaliacaoDesempenho) {
        this.avaliacaoDesempenho = avaliacaoDesempenho;
    }

    public String recuperarAvaliacao() {
        if (this.getResultado() >= 95.0f)
            avaliacaoDesempenho.setEstatistica("Obsidian");
        else
            if (this.getResultado() >= 75.0f)
                avaliacaoDesempenho.setEstatistica("Emerald");
            else
                if (this.getResultado() >= 50.0f)
                    avaliacaoDesempenho.setEstatistica("Diamond");
                else
                    avaliacaoDesempenho.setEstatistica("Silver");

        return avaliacaoDesempenho.getEstatistica();
    }


    public void salvarAvaliacao() {
        if (avaliacaoDesempenho.getEstatistica().equals("Obsidian"))
            this.setResultado(95.0f);
        else
            if (avaliacaoDesempenho.getEstatistica().equals("Emerald"))
                this.setResultado(75.0f);
            else
                if (avaliacaoDesempenho.getEstatistica().equals("Diamond"))
                    this.setResultado(50.0f);
                else
                    this.setResultado(0.0f);
    }
}
