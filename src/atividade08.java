import java.util.Scanner;

        import java.util.Scanner;

        public class atividade08 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


                char[][] tabuleiro = new char[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        tabuleiro[i][j] = '-';
                    }
                }


                char jogadorAtual = 'X';


                for (int jogada = 0; jogada < 9; jogada++) {
                    System.out.println("\nTabuleiro atual:");
                    mostrarTabuleiro(tabuleiro);


                    System.out.println("Jogador " + jogadorAtual + ", escolha linha e coluna (0, 1 ou 2):");
                    int linha = sc.nextInt();
                    int coluna = sc.nextInt();

                    if (tabuleiro[linha][coluna] == '-') {
                        tabuleiro[linha][coluna] = jogadorAtual;
                    } else {
                        System.out.println("Posição ocupada! Tente novamente.");
                        jogada--;
                        continue;
                    }


                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }


                System.out.println("\nTabuleiro final:");
                mostrarTabuleiro(tabuleiro);

                sc.close();
            }


            public static void mostrarTabuleiro(char[][] tabuleiro) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tabuleiro[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


