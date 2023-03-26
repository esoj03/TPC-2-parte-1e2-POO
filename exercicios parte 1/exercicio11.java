import javax.swing.*;
import java.util.Scanner;

public class exercicio11 {
    public static <valores> void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[5]; // vetor de 5 posições
        int resultado = 0;
        int igual = 0;
        int aux = 0;
        int maior  = 0;
        int menor  = 0;
        int cont = 0, cont1 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor do " + (i + 1) + "º valor: " );
            valores[i] = scan.nextInt();
        }
        menor = valores[0];
        maior = valores[0];
        for (int i = 0; i < 5; i++) {
            resultado += valores[i];

            if (menor > valores[i])
                menor = valores[i]; // Verifica e add o menor valor
            if (maior < valores[i])
                maior = valores[i]; // Verifica e add o maior valor
            if (valores[i] % 2 == 0)
                cont ++;
            else
                cont1++;
            System.out.println("O total cumulativo = " + resultado);
        }
        System.out.println("O menor valor e =" + menor);
        System.out.println("O maior valor e =" + maior);
        System.out.println("Quantidade de pares =" + cont);
        System.out.println("Quantidade de impares =" + cont1);

        /*for (int i=0;i<10;i++) {
            for (int j=0;j<9;j++) {
                if(valores[i]==valores[j+1]) {
                    igual=valores[i];

                }//if
            }//fim do 2 for

        }//fim do for
        JOptionPane.showMessageDialog(null, aux);*/

    }
}
