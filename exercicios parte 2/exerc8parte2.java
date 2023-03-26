import java.util.Random;

public class exerc8parte2 {
    public static void main(String[] args){
        Random random = new Random();
        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < 10; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numerosAleatorios[i]);
        }
    }
}
