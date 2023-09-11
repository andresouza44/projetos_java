import java.util.Scanner;

public class Partida {

    public static String novaPartida (Jogador jogador) {
        Scanner scan = new Scanner(System.in);
        Peca[][] tabuleiro = Table.createEmptyTable();
        Table.printTable(tabuleiro);
        boolean fimJogo = false;
        int contJogadas = 0;
        System.out.println("Jogador " + jogador + " inicia a partida.\n");
        String empate;
        while (!fimJogo) {
            jogada(tabuleiro,jogador);
            if (Partida.vencedor(tabuleiro)) {
                System.out.println("Fim da partida. Vencedor Jogador: " + jogador);
                return jogador.toString();
            }
            // inverte jogador da vez
            if (jogador == Jogador.X) {
                jogador = Jogador.O;
            } else {
                jogador = Jogador.X;
            }
            contJogadas++;
            if (contJogadas == 9) {
                System.out.println("Fim da partida : EMPATE");
                return "empate";

            }
        }
        empate = "empate";
        return empate;
    }
    public static void jogada(Peca[][] tabuleiro , Jogador jogador){
        boolean jogadaValida = false;
        while(!jogadaValida) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Vez do Jogador " + jogador + " .Escolha uma posição: Exemplo 11 (linha x coluna) : ");
            String posicao = scan.nextLine();

            if (!Partida.verificaJogada(tabuleiro, posicao)) {
                continue;
            }

            int linha = Integer.parseInt(String.valueOf(posicao.charAt(0)));
            int coluna = Integer.parseInt(String.valueOf(posicao.charAt(1)));

            // Adiciona peça ao tabuleiro
            tabuleiro[linha - 1][coluna - 1].setJogador(jogador);
            Table.printTable(tabuleiro);

            jogadaValida = true;
        }



    }
    public static Boolean verificaJogada(Peca[][] tabuleiro, String posicao) {

        try {

            int linha = Integer.parseInt(String.valueOf(posicao.charAt(0)));
            int coluna = Integer.parseInt(String.valueOf(posicao.charAt(1)));


            if (linha > 3 || coluna > 3) {
                return false;
            }
            if (tabuleiro[linha - 1][coluna - 1].getJogador() != null) {
                System.out.println("Posição Inválida, posição [" + linha + coluna + "] já está ocupada.");
                return false;
            }
        } catch (Exception  e) {
            System.out.println("Posição [" + posicao + "] inválida");
            return false;

        }

        return true;
    }
    public static Boolean vencedor(Peca[][] tabuleiro){
        for (int l=0; l<3; l ++) {
                if ((tabuleiro[l][0].getJogador() == tabuleiro[l][1].getJogador())
                        && (tabuleiro[l][1].getJogador() == tabuleiro[l][2].getJogador())
                        && (tabuleiro[l][0].getJogador() != null)) {
                    return true;
                }
            }
        for (int c=0; c<3; c ++) {
            if ((tabuleiro[0][c].getJogador() == tabuleiro[1][c].getJogador())
                    && (tabuleiro[1][c].getJogador() == tabuleiro[2][c].getJogador())
                    && (tabuleiro[0][c].getJogador() != null))
                return true;
        }
        if ((tabuleiro[0][0].getJogador() == tabuleiro[1][1].getJogador())
                && (tabuleiro[1][1].getJogador() == tabuleiro[2][2].getJogador())
                && (tabuleiro[1][1].getJogador() != null))
            return true;

        if ((tabuleiro[2][0].getJogador() == tabuleiro[1][1].getJogador())
                && (tabuleiro[1][1].getJogador() == tabuleiro[0][2].getJogador())
                && (tabuleiro[1][1].getJogador() != null))
            return true;
        return false;

    }

}
