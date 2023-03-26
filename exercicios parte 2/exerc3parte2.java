import java.util.ArrayList;

public class exerc3parte2 {
    public static void main(String[] args){
        ArrayList<Integer> primos = new ArrayList<Integer>();
        primos.add(2);
        primos.add(3);
        primos.add(5);
        primos.add(7);
        primos.add(11);

        System.out.println(primos);

        //Imprimir os valores na ordem inversa
        for (int i = primos.size() - 1; i >= 0; i--) {
            System.out.println(primos.get(i));
        }
    }
}