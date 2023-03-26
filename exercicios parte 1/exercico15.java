import java.util.Scanner;
public class exercico15{
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial (m/s):");
        double v0 = scanner.nextDouble();
        double g = 9.81;
        double t = 0.01;

        double s = v0 * t;
        double v = v0 - (g * t);

        for (int i = 0; i < 100; i++) {
            s = s + v * t;
            v = v - g * t;

            if (i % 10 == 0) {
                System.out.println("Posição apos " + i + " segundos = " + s);
                System.out.println("Velocidade apos " + i + " segundos = " + v);
            }
        }

        double posicaoExata = v0 * t - 0.5 * g * Math.pow(t, 2);
        System.out.println("Posição exata = " + posicaoExata);
    }
}