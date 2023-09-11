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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Peca peca = (Peca) o;

        return jogador == peca.jogador;
    }

    @Override
    public int hashCode() {
        return jogador != null ? jogador.hashCode() : 0;
    }

    @Override
    public String toString() {
        return
                jogador + ":" +  positionL +
                getPositionC;
    }
}
