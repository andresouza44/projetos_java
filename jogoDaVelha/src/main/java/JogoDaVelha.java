import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        System.out.println(" ---- JOGO DA VELHA ---- ");
        System.out.println("Jogador X inicia a partida.\n");

        Scanner scan = new Scanner(System.in);
        Peca[][] tabuleiro = Table.createEmptyTable();
        Table.printTable(tabuleiro);

        Jogador jogador = Jogador.X;
        Boolean fimJogo = false;


        while (!fimJogo) {

            System.out.print("Vez do Jogador " + jogador + " .Escolha uma posição: Exemplo 11 (linha x coluna) : ");
            String posicao = scan.nextLine();

            if (!Jogada.verificaJogada(tabuleiro, posicao)){
                //System.out.println("" + "Jogada Invalida");
                continue;
            }
            int linha = Integer.parseInt(String.valueOf(posicao.charAt(0)));
            int coluna = Integer.parseInt(String.valueOf(posicao.charAt(1)));

            // Todo vericar jogada valida
            // Todo verificar se já tem vencedor

            tabuleiro[linha-1][coluna-1].setJogador(jogador);
            Table.printTable(tabuleiro);
            // inverte jogador da vez
            if (jogador == Jogador.X){
                jogador = Jogador.O;
            }else {
                jogador = Jogador.X;
            }



        }
    }

}


