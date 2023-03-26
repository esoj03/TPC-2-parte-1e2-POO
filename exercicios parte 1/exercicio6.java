import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        double x = 0;
        double s;
        while (true) {

            s = 1.0 / (1 + n * n);
            n ++;
            x = x + s;
            if (s > 0.01){
                break;
            }
        }

        System.out.println(x);
    }

}