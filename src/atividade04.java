public class atividade04 {
    public static void main(String[] args) {
         int [][] matriz = new int[4][4];
         int limiteSuperior = 100;

         for (int i = 0; i < 4; i++){
             for (int j = 0; j < 4; j++){
                 matriz[i][j] = (int)(Math.random() * limiteSuperior);
                 if (i == j){
                     System.out.println("Elemento da diagonal principal (" + i + "," + j + "): " + matriz[i][j]);
                 }
             }
         }
        System.out.println("\nMatriz Completa:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
