import java.util.Random;

public class atividade02 {
    public static void main(String[] args) {

        Random gerador = new Random();
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = gerador.nextInt(100) + 1 ;
            System.out.println(numeros[i] + " ");
        }


        System.out.println("Numeros pares e impares:");
        for (int numero : numeros) {
            if (numero % 2 == 0 ) {
            System.out.println(numero + " É par");
            } else {
            System.out.println(numero + " È impar");

            }
        }
    }
}
