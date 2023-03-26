import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        int cont = 0, pos = 0;
        System.out.printf("Informe uma cadeia de caracteres:\n");
        Scanner ler = new Scanner(System.in);
        String s = ler.nextLine();


        //Apenas as letras maiúsculas na string.
        String se = null;
        String novo = null;
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            if (Character.isUpperCase(letra)) {
                cont++;
            }
            System.out.println("Letras maiusculas = " + letra);
            //O número de vogais na string.
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont++;
                pos = i;
            }
            System.out.println("As posicoes das vogais = " + pos);

            //A string, com todas as vogais substituídas por um sublinhado.
            novo = s.replaceAll("[aeiouAEIOU]", "_");

        }
        System.out.println("O numero de vogais =" + cont);
        System.out.println("Substituindo as vogais por (-)" + novo);

        //Cada segunda letra da string.
        String[] separado = s.split(" ");

        for (int j = 0; j < separado.length; j++) {
            String[] separado2 = separado[j].split("");
            System.out.println("A segunda letra de cada palavra: " + separado2[1]);
        }
    }
}