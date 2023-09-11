import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean novaPartida = true;
        int placarJogadorX = 0;
        int placarJogadorO = 0;
        int empate = 0;
        Jogador jogador = Jogador.O;



        while (novaPartida) {

            System.out.println(" ---- JOGO DA VELHA ---- ");
            System.out.println(" 1 -  Nova Partida");
            System.out.println(" 2 -  Reniciar Placar");
            System.out.println(" 3 -  Sair");
            String menu = scan.nextLine();

            if (menu.equals("3")){
                novaPartida = false;
                System.out.println("Fim de jogo");
                placar(placarJogadorX, placarJogadorO, empate);
                continue;
            }
            if (menu.equals("2")){
                placarJogadorX = 0;
                placarJogadorO = 0;
                empate = 0;
                System.out.println("Placar Reiniciado");
                continue;
            }
            // Nova partida
            if (menu.equals("1")){


            if (jogador == Jogador.X) {
                jogador = Jogador.O;
            } else {
                jogador = Jogador.X;
            }


            Peca[][] tabuleiro = Table.createEmptyTable();
            Table.printTable(tabuleiro);
            boolean fimJogo = false;
            int contJogadas = 0;
            System.out.println("Jogador " + jogador + " inicia a partida.\n");
            while (!fimJogo) {

                System.out.print("Vez do Jogador " + jogador + " .Escolha uma posição: Exemplo 11 (linha x coluna) : ");
                String posicao = scan.nextLine();

                if (!Jogada.verificaJogada(tabuleiro, posicao)) {
                    continue;
                }

                int linha = Integer.parseInt(String.valueOf(posicao.charAt(0)));
                int coluna = Integer.parseInt(String.valueOf(posicao.charAt(1)));

                // Adiciona peça ao tabuleiro
                tabuleiro[linha - 1][coluna - 1].setJogador(jogador);
                Table.printTable(tabuleiro);

                if (Jogada.vencedor(tabuleiro)) {
                    System.out.println("Fim de jogo. Vencedor Jogador: " + jogador);
                    if (jogador == Jogador.X){
                        placarJogadorX++;

                    }
                    else {
                        placarJogadorO++;
                    }
                    placar(placarJogadorX,placarJogadorO,empate);
                    fimJogo = true;
                }


                // inverte jogador da vez
                if (jogador == Jogador.X) {
                    jogador = Jogador.O;
                } else {
                    jogador = Jogador.X;
                }
                contJogadas++;
                if (contJogadas == 9) {
                    System.out.println("Fim de jogo : EMPATE");
                    empate++;
                    fimJogo = true;
                    placar(placarJogadorX,placarJogadorO,empate);
                }
            }
        }
            else{
                System.out.println("Entrada inválida. Escolha 1, 2 ou 3");
                continue;
            }
        }
    }
    public static  void placar (int X, int O, int empate){
        System.out.println("---- Placar ----");
        System.out.println("Jogador X: " + X);
        System.out.println("Jogador O: " + O);
        System.out.println("Empate   : " + empate);
    }

}


