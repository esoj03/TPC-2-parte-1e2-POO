public class exercicio9 {
    public static void main (String[] args){
        int altura = 3; int largura = 3;
        //for (int i = 1; i<= altura; i++){
        //    for (int j = 1; j <= altura; j++){
        //        System.out.print('#');
        //    }
        //    System.out.println();
        //}
        for (int i = 0; i < 9 ; i++){
            System.out.print('#');
            if(i == 2){
                System.out.println();
            }
            if(i == 5){
                System.out.println();
            }
        }
    }
}