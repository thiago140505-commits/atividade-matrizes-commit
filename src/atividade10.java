import java.util.Random;
import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int tamanho = 7;
        char[][] mar = new char[tamanho][tamanho];
        int[][] navios = new int[tamanho][tamanho];


        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                mar[i][j] = '~';
            }
        }


        int totalNavios = 3;
        int colocados = 0;
        while (colocados < totalNavios) {
            int linha = rand.nextInt(tamanho);
            int coluna = rand.nextInt(tamanho);

            if (navios[linha][coluna] == 0) {
                navios[linha][coluna] = 1;
                colocados++;
            }
        }

        int encontrados = 0;

        while (encontrados < totalNavios) {

            System.out.println("\n--- MAR ---");
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    System.out.print(mar[i][j] + " ");
                }
                System.out.println();
            }


            System.out.print("\nDigite a linha (0-6): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0-6): ");
            int coluna = sc.nextInt();


            if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho) {
                System.out.println(" Posição inválida, tente novamente!");
                continue;
            }

            if (mar[linha][coluna] != '~') {
                System.out.println(" Você já tentou essa posição!");
                continue;
            }

            if (navios[linha][coluna] == 1) {
                System.out.println(" Acertou um navio!");
                mar[linha][coluna] = 'X';
                encontrados++;
            } else {
                System.out.println(" Água...");
                mar[linha][coluna] = 'O';
            }
        }

        System.out.println("\n Parabéns! Você encontrou todos os navios!");
        System.out.println("Tabuleiro final:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(mar[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
