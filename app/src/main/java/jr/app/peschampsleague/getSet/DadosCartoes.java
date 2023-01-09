package jr.app.peschampsleague.getSet;

public class DadosCartoes {

    private String jogadorCartoes;
    private String equipeCartoes;
    private String qtdCAmarelos;
    private String qtdCVermelhos;
    private int imgEquipeCards;

    public DadosCartoes(String jogadorCartoes, String equipeCartoes, String qtdCAmarelos, String qtdCVermelhos, int imgEquipeCards) {
        this.jogadorCartoes = jogadorCartoes;
        this.equipeCartoes = equipeCartoes;
        this.qtdCAmarelos = qtdCAmarelos;
        this.qtdCVermelhos = qtdCVermelhos;
        this.imgEquipeCards = imgEquipeCards;
    }

    public DadosCartoes() {
    }

    public String getJogadorCartoes() {
        return jogadorCartoes;
    }

    public void setJogadorCartoes(String jogadorCartoes) {
        this.jogadorCartoes = jogadorCartoes;
    }

    public String getEquipeCartoes() {
        return equipeCartoes;
    }

    public void setEquipeCartoes(String equipeCartoes) {
        this.equipeCartoes = equipeCartoes;
    }

    public String getQtdCAmarelos() {
        return qtdCAmarelos;
    }

    public void setQtdCAmarelos(String qtdCAmarelos) {
        this.qtdCAmarelos = qtdCAmarelos;
    }

    public String getQtdCVermelhos() {
        return qtdCVermelhos;
    }

    public void setQtdCVermelhos(String qtdCVermelhos) {
        this.qtdCVermelhos = qtdCVermelhos;
    }

    public int getImgEquipeCards() {
        return imgEquipeCards;
    }

    public void setImgEquipeCards(int imgEquipeCards) {
        this.imgEquipeCards = imgEquipeCards;
    }
}
