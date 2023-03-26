public class exer9parte2 {
    public static void main(String[] args){

        // Alinea a
        int[] array = new int[0];
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Alinea b
        int produto = 1;
        for (int element : array) {
            produto *= element;
        }

        // Alinea c
        int contadorNegativos = 0;
        for (int element : array) {
            if (element < 0) {
                contadorNegativos++;
            }
        }
    }
}