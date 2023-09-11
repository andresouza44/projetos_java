import java.util.Scanner;

public class Jogada {
    public static String jogada() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma posição: Exemplo 11 (linha x coluna)");
        String posicao = scan.nextLine();
        int linha = posicao.charAt(0);
        int colina = posicao.charAt(1);
        return posicao;

    }

    public static Boolean verificaJogada(Peca[][] tabuleiro, String posicao) {

        try {

            int linha = Integer.parseInt(String.valueOf(posicao.charAt(0)));
            int coluna = Integer.parseInt(String.valueOf(posicao.charAt(1)));


            if (linha > 3 || coluna > 3) {
                return false;
            }
            if (tabuleiro[linha - 1][coluna - 1].getJogador() != null) {
                System.out.println("Jogada Inválida, posição [" + linha + coluna + "] já está ocupada.");
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
