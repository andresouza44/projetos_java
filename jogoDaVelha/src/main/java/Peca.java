public class Peca {
    Jogador jogador;
    Integer positionL;
    Integer getPositionC;

    public Peca() {
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Integer getPositionL() {
        return positionL;
    }

    public void setPositionL(Integer positionL) {
        this.positionL = positionL;
    }

    public Integer getGetPositionC() {
        return getPositionC;
    }

    public void setGetPositionC(Integer getPositionC) {
        this.getPositionC = getPositionC;
    }

    @Override
    public String toString() {
        return
                jogador + ":" +  positionL +
                getPositionC;
    }
}
