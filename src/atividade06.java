public class atividade06 {
    public static void main(String[] args) {
        int[][] matrizIdentidade = new int[5][5];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }

        // Exibir a matriz
        System.out.println("Matriz identidade 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizIdentidade[i][j] + " ");
            }
            System.out.println();
        }
    }
}
