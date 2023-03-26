public class exerc2parte2 {
    public static void main(String[] args){
        String[][] tabuleiro = new String[3][3];

        // Preenchendo o tabuleiro com "x", "o" e ""
        tabuleiro[0][0] = "x |";
        tabuleiro[0][1] = "o |";
        tabuleiro[0][2] = "";

        tabuleiro[1][0] = "o";
        tabuleiro[1][1] = "| x";
        tabuleiro[1][2] = "| o";

        tabuleiro[2][0] = "  |";
        tabuleiro[2][1] = "o";
        tabuleiro[2][2] = "| x";


        System.out.println("Tabuleiro Fitch-Fatch:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
