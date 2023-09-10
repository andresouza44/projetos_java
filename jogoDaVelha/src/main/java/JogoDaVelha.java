
public class JogoDaVelha {

    public static void main(String[] args) {

        Table tab = new Table();
        Peca[][] tabuleiro = tab.createEmptyTable();
        Peca[][] tabuleiro1 = Table.createEmptyTable();
        tabuleiro[1][1].setJogador(Jogador.X);
        tabuleiro[0][0].setJogador(Jogador.O);
        tab.printTable(tabuleiro);


        Table.printTable(tabuleiro1);
    }

}

//        Peca[][] tabuleiro2 = createEmptyTable();
//        System.out.println(tabuleiro2[1][2].getJogador());
//        printTable(tabuleiro);



        /*Table tabuleiro = new Table();

        tabuleiro.createEmptyTable();
        tabuleiro.printTable();


        List<Peca> pecas = new ArrayList<>();
        System.out.println("digita a posição");

        Peca peca1 = new Peca();
        peca1.setJogador(Jogador.X);
        peca1.setPositionL(1);
        peca1.setGetPositionC(1);
        pecas.add(peca1);

        Peca peca2 = new Peca();
        peca2.setJogador(Jogador.O);
        peca2.setPositionL(2);
        peca2.setGetPositionC(1);
        pecas.add(peca2);

        System.out.println(pecas);



*/


