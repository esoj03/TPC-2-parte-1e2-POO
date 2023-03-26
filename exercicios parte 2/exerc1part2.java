import java.util.Arrays;

public class exerc1part2 {
    public static void main(String[] args){
        int[][] novo = new int[8][8];

        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if(i%2==0){
                    novo[i][j]=j%2;
                }
                else{
                    novo[i][j]=(j+1)%2;
                }
            }

        }
        System.out.println(Arrays.deepToString(novo) + "\n");
    }
}