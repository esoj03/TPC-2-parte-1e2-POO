import java.util.Scanner;

public class exercico14 {
    public static void main(String[] args){
        int escolha;
        Scanner input = new Scanner(System.in);
        int var = 0, var1 =0, var2 = 0, var3 = 0;

        do {

            System.out.println("Selecione uma opção:");
            System.out.println("[1] - Sumo");
            System.out.println("[2] - Bolo");
            System.out.println("[3] - Chocolate");
            System.out.println("[4] - Batatas Fritas");
            System.out.println("[5] - Total a pagar");
            System.out.println("[6] - Sair");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Aqui está o seu Sumo.");
                    var++;
                    break;
                case 2:
                    System.out.println("Aqui está o seu Bolo.");
                    var1++;
                    break;
                case 3:
                    System.out.println("Aqui está o seu Chocolate.");
                    var2++;
                    break;
                case 4:
                    System.out.println("Aqui estão as suas Batatas Fritas.");
                    var3++;
                    break;
                case 5:

                    System.out.println(var + " itens Sumo vendido(s)");
                    System.out.println(var1 + " itens Bolo vendido(s)");
                    System.out.println(var2 + " itens Chocolate vendido(s)");
                    System.out.println(var3 + " itens Batatas Fritas vendido(s)");
                    break;
                case 6:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Erro. Escolha uma opção de 1 a 6.");
            }

            System.out.println();
        } while (escolha != 6);

        input.close();
    }

}