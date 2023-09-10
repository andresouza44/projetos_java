import java.util.Scanner;

public class Jogada {
    public static String jogada(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma posição: Exemplo 11 (linha x coluna)");
        String posicao = scan.nextLine();
        int linha = posicao.charAt(0);
        int colina = posicao.charAt(1);



        //verificaJogada(posicao);
        return posicao;

    }
    public static Boolean verificaJogada(Peca [][] tabuleiro, String posicao){

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
        }
        catch (NumberFormatException e ){
            System.out.println("Posição ["+posicao+"] inválida");
            return false;

        }

    return true;
    }

}
