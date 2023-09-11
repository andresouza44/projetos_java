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
                String vencedor = Partida.novaPartida(jogador);
                    if (vencedor.equals("X")){
                        placarJogadorX++;

                    }
                    else if((vencedor.equals("O"))) {
                        placarJogadorO++;
                    }
                    else {
                        empate++;
                    }
                placar(placarJogadorX,placarJogadorO,empate);
            }
            else{
                System.out.println("Entrada inválida. Escolha 1, 2 ou 3.");
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


