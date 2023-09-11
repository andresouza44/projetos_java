import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        System.out.println(" ---- JOGO DA VELHA ---- ");
        System.out.println("Jogador X inicia a partida.\n");

        Scanner scan = new Scanner(System.in);
        Peca[][] tabuleiro = Table.createEmptyTable();
        Table.printTable(tabuleiro);

        Jogador jogador = Jogador.X;
        boolean fimJogo = false;
        int contJogadas = 0;


        while (!fimJogo) {

            System.out.print("Vez do Jogador " + jogador + " .Escolha uma posição: Exemplo 11 (linha x coluna) : ");
            String posicao = scan.nextLine();

            if (!Jogada.verificaJogada(tabuleiro, posicao)){
                continue;
            }

            int linha = Integer.parseInt(String.valueOf(posicao.charAt(0)));
            int coluna = Integer.parseInt(String.valueOf(posicao.charAt(1)));

            // Adiciona peça ao tabuleiro
            tabuleiro[linha-1][coluna-1].setJogador(jogador);
            Table.printTable(tabuleiro);

            if(Jogada.vencedor(tabuleiro)){
                System.out.println("Fim de jogo. Vencedor Jogador: " + jogador );
                fimJogo = true;
            };


            // inverte jogador da vez
            if (jogador == Jogador.X){
                jogador = Jogador.O;
            }else {
                jogador = Jogador.X;
            }

            contJogadas ++ ;
            if (contJogadas ==9){
                System.out.println("Fim de jogo : EMPATE");
                fimJogo = true;
            }
        }
    }

}


