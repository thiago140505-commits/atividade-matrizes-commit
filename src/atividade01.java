import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {


            System.out.println("Digite os numeros: ");
            numeros[i] = sc.nextInt();
        }


        Integer maiorNumero = null;
        Integer menorNumero = null;


        for (int i = 0; i < numeros.length; i++) {
            if (maiorNumero == null) {
                maiorNumero = numeros[i];
                menorNumero = numeros[i];
            } else {
                if (numeros[i] > maiorNumero) {
                    maiorNumero = numeros[i];
                }
                if (numeros[i] < menorNumero) {
                    menorNumero = numeros[i];
                }
            }
        }

        System.out.println("Seu maio numero é: " + maiorNumero);
        System.out.println("Seu menor numero é: " + menorNumero);

    }
}
