import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.print("Digite os numeros da matriz 3x3");
        System.out.println();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Numero da linha " + (i + 1) + " coluna " + (j + 1) + ": ");
            matriz[i][j] = sc.nextInt();
        }
        }
        System.out.println("Matrizes digitadas:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    }
        System.out.println("---Soma das linhas---");
        for (int i = 0; i < 3; i++){
            int somaLinha = 0;
            for (int j = 0; j < 3; j++){
                somaLinha += matriz[i][j];
                System.out.println("Soma da Linha " + (i + 1) + ": " + somaLinha);
            }
        }
            System.out.println("---Soma das linhas e colunas---");
            for (int i = 0; i < 3; i++){
                int somaColuna = 0;
                for (int j = 0; j < 3; j++){
                    somaColuna += matriz[i][j];
                    System.out.println("Soma da Coluna " + (j + 1) + ": " + somaColuna);
                }

            }

        sc.close();
       }
    }
