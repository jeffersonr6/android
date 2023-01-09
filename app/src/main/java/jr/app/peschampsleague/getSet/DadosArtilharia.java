package jr.app.peschampsleague.getSet;

public class DadosArtilharia {

    private String jogador;
    private String equipe;
    private String gols;
    private int ImgEquipeArt;

    public DadosArtilharia(String jogador, String equipe, String gols, int imgEquipeArt) {
        this.jogador = jogador;
        this.equipe = equipe;
        this.gols = gols;
        ImgEquipeArt = imgEquipeArt;
    }

    public DadosArtilharia() {
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getGols() {
        return gols;
    }

    public void setGols(String gols) {
        this.gols = gols;
    }

    public int getImgEquipeArt() {
        return ImgEquipeArt;
    }

    public void setImgEquipeArt(int imgEquipeArt) {
        ImgEquipeArt = imgEquipeArt;
    }
}
