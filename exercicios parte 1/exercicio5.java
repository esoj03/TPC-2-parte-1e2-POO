public  class exercicio5 {
    public static void main(String[] args){
        int cont = 11, s = 0, i = 0;
        //for (int i = 1; i<= 10; i++){
        //    s = s + i;
        //    System.out.println(s);
        //}

        // Rescrevendo o for acima com um while
        while (cont != 0){
            s = s + i++;
            cont--;
            System.out.println(s);
        }
    }
}