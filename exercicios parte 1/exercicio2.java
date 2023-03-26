import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        int soma = 0, soma1 = 0, soma3 = 0, valor = 0;

        //A soma de todos os números pares e os numeros impares entre 2 e 100 (inclusive).
        for(int i = 0; i<6; i++){
            if(i % 2 == 0){
                soma += i;
            }
            else{
                soma3 += i;
            }
            // A soma de todos os quadrados entre 1 e 100 (inclusive).
            if(i % 10 == 0){
                soma1 += i;
            }
        }
        //System.out.println(valor);
        // Instrucao para calcular a soma de os digitos impares de um dado numero
        int soma4 = 0;
        System.out.println("Valor: ");
        Scanner num = new Scanner(System.in);
        valor = num.nextInt();
        int number1 = valor;
        String number = String.valueOf(number1);
        char[] digits1 = number.toCharArray();
        for(int i = 0; i < digits1.length; i++) {
            //System.out.println(digits1[i]);
            if (digits1[i] % 2 != 0){
                soma4 +=Integer.parseInt(String.valueOf(digits1[i]));
            }
        }
        System.out.println(soma4);
    }
}