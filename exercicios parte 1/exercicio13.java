import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){

        /*
        double result = 0.0, result2 = 0.0;

        System.out.print("Digite a taxa de nascimento de presas:\n");
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();

        System.out.print("Digite a taxa de predacao:\n");
        Scanner ler1 = new Scanner(System.in);
        double b = ler1.nextDouble();

        System.out.print("Digite a taxa de morte de predadores:\n");
        Scanner ler2 = new Scanner(System.in);
        float c = ler2.nextFloat();

        System.out.print("Didite o aumento de predador:\n");
        Scanner ler3 = new Scanner(System.in);
        float d = ler3.nextFloat();

        System.out.print("Digite a taxa de nascimento de presas:\n");
        Scanner ler4 = new Scanner(System.in);
        int numpresas = ler4.nextInt();
        System.out.print("Digite a taxa de nascimento de presas:\n");
        Scanner ler5 = new Scanner(System.in);
        int numpredador = ler5.nextInt();

        //P(t+1) = P(t) + A*P(t) – B*P(t)*D(t);
        result = (numpresas * (a - (b * numpredador)));

        result2 = numpredador * (1 - c + d * numpresas);
        System.out.print(result);
        */

        Scanner scanner = new Scanner(System.in);

        // Pede taxas ao utilizador
        System.out.print("Taxa na qual o nascimento de presas excede a morte natural (A): ");
        double taxaA = scanner.nextDouble();
        System.out.print("Taxa de predação (B): ");
        double taxaB = scanner.nextDouble();
        System.out.print("Taxa na qual as mortes de predadores excedem os nascimentos sem comida (C): ");
        double taxaC = scanner.nextDouble();
        System.out.print("Aumento predador na presença de comida (D): ");
        double taxaD = scanner.nextDouble();

        // Pede tamanhos iniciais da população
        System.out.print("População inicial de presas (P): ");
        int populacaoP = scanner.nextInt();
        System.out.print("População inicial de predadores (Q): ");
        int populacaoQ = scanner.nextInt();

        // Pede número de períodos
        System.out.print("Número de períodos: ");
        int numPeriodos = scanner.nextInt();

        // Imprime cabeçalho da tabela
        System.out.println("Período\tP\tQ");

        // Calcula populações para cada período
        int periodo = 0;
        while (periodo <= numPeriodos) {

            // Imprime período, população de presas e população de predadores
            System.out.println(periodo + "\t" + populacaoP + "\t" + populacaoQ);

            // Calcula variacao da população de presas
            int variacaoP = (int) (populacaoP * (taxaA - (taxaB * populacaoQ)));

            // Calcula variacao da população de predadores
            int variacaoQ = (int) (populacaoQ * (taxaD * populacaoP - taxaC));

            // Atualiza população de presas
            populacaoP = populacaoP + variacaoP;

            // Atualiza população de predadores
            populacaoQ = populacaoQ + variacaoQ;

            // Próximo período
            periodo++;
        }
    }
}


