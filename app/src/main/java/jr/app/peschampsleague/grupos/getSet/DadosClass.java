package jr.app.peschampsleague.grupos.getSet;

public class DadosClass {

    private String equipe;
    private String pontos;
    private String jogos;
    private String vitorias;
    private String empates;
    private String derrotas;
    private String golsPro;
    private String golsContra;
    private String saldoGols;
    private String cAmarelos;
    private String cVermelhos;
    private int imgEquipeClass;

    public DadosClass(String equipe, String pontos, String jogos, String vitorias, String empates, String derrotas, String golsPro, String golsContra, String saldoGols, String cAmarelos, String cVermelhos, int imgEquipeClass) {
        this.equipe = equipe;
        this.pontos = pontos;
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.saldoGols = saldoGols;
        this.cAmarelos = cAmarelos;
        this.cVermelhos = cVermelhos;
        this.imgEquipeClass = imgEquipeClass;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public String getVitorias() {
        return vitorias;
    }

    public void setVitorias(String vitorias) {
        this.vitorias = vitorias;
    }

    public String getEmpates() {
        return empates;
    }

    public void setEmpates(String empates) {
        this.empates = empates;
    }

    public String getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(String derrotas) {
        this.derrotas = derrotas;
    }

    public String getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(String golsPro) {
        this.golsPro = golsPro;
    }

    public String getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(String golsContra) {
        this.golsContra = golsContra;
    }

    public String getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(String saldoGols) {
        this.saldoGols = saldoGols;
    }

    public String getcAmarelos() {
        return cAmarelos;
    }

    public void setcAmarelos(String cAmarelos) {
        this.cAmarelos = cAmarelos;
    }

    public String getcVermelhos() {
        return cVermelhos;
    }

    public void setcVermelhos(String cVermelhos) {
        this.cVermelhos = cVermelhos;
    }

    public int getImgEquipeClass() {
        return imgEquipeClass;
    }

    public void setImgEquipeClass(int imgEquipeClass) {
        this.imgEquipeClass = imgEquipeClass;
    }
}
