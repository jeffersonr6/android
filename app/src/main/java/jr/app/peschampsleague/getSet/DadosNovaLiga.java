package jr.app.peschampsleague.getSet;

public class DadosNovaLiga {

    private int img;
    private String equipe;
    private String player;
    private String grupo;

    public DadosNovaLiga(int img, String equipe, String player, String grupo) {
        this.img = img;
        this.equipe = equipe;
        this.player = player;
        this.grupo = grupo;
    }

    public DadosNovaLiga() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
