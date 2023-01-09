package jr.app.peschampsleague.partidas.getSet;

public class DadosJogos {

    private String equipeA;
    private String equipeB;
    private String resultadoA;
    private String resultadoB;
    private int imgEquipeA;
    private int imgEquipeB;
    private String statusPartida;
    private String tipoJogo;

    public DadosJogos(String equipeA, String equipeB, String resultadoA, String resultadoB, int imgEquipeA, int imgEquipeB, String statusPartida, String tipoJogo) {
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.resultadoA = resultadoA;
        this.resultadoB = resultadoB;
        this.imgEquipeA = imgEquipeA;
        this.imgEquipeB = imgEquipeB;
        this.statusPartida = statusPartida;
        this.tipoJogo = tipoJogo;
    }

    public DadosJogos() {
    }

    public String getEquipeA() {
        return equipeA;
    }

    public void setEquipeA(String equipeA) {
        this.equipeA = equipeA;
    }

    public String getEquipeB() {
        return equipeB;
    }

    public void setEquipeB(String equipeB) {
        this.equipeB = equipeB;
    }

    public String getResultadoA() {
        return resultadoA;
    }

    public void setResultadoA(String resultadoA) {
        this.resultadoA = resultadoA;
    }

    public String getResultadoB() {
        return resultadoB;
    }

    public void setResultadoB(String resultadoB) {
        this.resultadoB = resultadoB;
    }

    public int getImgEquipeA() {
        return imgEquipeA;
    }

    public void setImgEquipeA(int imgEquipeA) {
        this.imgEquipeA = imgEquipeA;
    }

    public int getImgEquipeB() {
        return imgEquipeB;
    }

    public void setImgEquipeB(int imgEquipeB) {
        this.imgEquipeB = imgEquipeB;
    }

    public String getStatusPartida() {
        return statusPartida;
    }

    public void setStatusPartida(String statusPartida) {
        this.statusPartida = statusPartida;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }
}

