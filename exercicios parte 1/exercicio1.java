import java.lang.Math;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int valor, potencia, soma = 0;
        System.out.println("Digite um valor: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Quadrados");
        for(int i = 0; i< n; i++){
            valor = (int) Math.pow(i, 2);
            if (valor <= n){
                System.out.println(valor);
            }
            if(i % 2 == 0){
                soma += i;
            }
            System.out.println("A soma dos pares = "+ soma);

        }
        System.out.println("Divisiveis por 10");
        for(int i = 0; i< n; i++){
            if(i % 10 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Potencias de 2");
        for(int i = 0; i< n; i++){
            potencia = (int) Math.pow(2, i);
            if (potencia <= n){
                System.out.println(potencia);
            }
        }
    }
}