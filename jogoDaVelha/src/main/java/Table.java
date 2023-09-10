public class Table {
    public Table() {
    }

    public static Peca[][] createEmptyTable() {
        Peca[][] tabuleiro = new Peca[3][3];
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                Peca peca = new Peca();
                tabuleiro[l][c] = peca;

            }
        }
        return tabuleiro;
    }

    public static void printTable(Peca[][] tabuleiro) {
        int tamanhoLin = tabuleiro.length;
        int tamanhoCol = tabuleiro[0].length;

        System.out.println("     1       2      3");
        for (int lin = 0; lin < tamanhoLin; lin++) {
            System.out.print(lin + 1 + "  ");
            for (int col = 0; col < tamanhoCol; col++)
                if (tabuleiro[lin][col].getJogador() == null) {
                    if (col != 2) {
                        System.out.print("    " + "  | ");
                    } else {
                        System.out.print("    ");
                    }
                } else {
                    System.out.print("  " + tabuleiro[lin][col].getJogador() + "   | ");
                }


            if (lin != 2) {
                System.out.println("\n   ------|-------|------");
            } else {
                System.out.println();
                System.out.println();
            }

        }
    }
}













      /*  public void printTable() {
            System.out.println("     1     2      3");
            String[][] tabuleiro = new String[3][3];
            for (int linha = 0; linha < tabuleiro.length; linha++) {
                System.out.print(linha + 1 + "  ");

                for (int coluna = 0; coluna < 3; coluna++)
                    tabuleiro[linha][coluna]= pecas.
                    //System.out.print(tabuleiro[linha][coluna] + " | ");
                    System.out.print(tabuleiro[linha][coluna] + " | ");

                System.out.println("\n   -----|------|------|");
            }

        }*/




