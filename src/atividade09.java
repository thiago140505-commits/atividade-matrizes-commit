import java.util.Scanner;
public class atividade09 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                String[] alunos = new String[5];   // nomes dos alunos
                double[][] notas = new double[5][2]; // 5 alunos, 2 notas cada
                double[] medias = new double[5];     // média de cada aluno

                // Entrada de dados
                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                    alunos[i] = sc.next();

                    for (int j = 0; j < 2; j++) {
                        System.out.print("Digite a nota " + (j + 1) + " de " + alunos[i] + ": ");
                        notas[i][j] = sc.nextDouble();
                    }

                    // Calcula média logo após digitar as notas
                    medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
                }

                // Exibe resultados
                System.out.println("\n--- MÉDIAS DOS ALUNOS ---");
                for (int i = 0; i < 5; i++) {
                    System.out.println(alunos[i] + " → Média: " + medias[i]);
                }

                sc.close();
            }
        }
    }
}
