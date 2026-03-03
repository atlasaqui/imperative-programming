import java.util.Scanner;

public class ComparadorATV1 {

    public static Scanner input = new Scanner(System.in);
    // criei um objeto para utilizar o scanner de qualquer lugar.

    public static void main(String[] args) {

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        int resultado = maior(n1, n2); 
        // Chamada da função maior() e armazenamento do retorno


        System.out.println("\nO maior valor digitado foi: " + resultado);
        // Exibição do resultado

        input.close();



    }
    public static int maior(int a, int b) { //com a função podemos utilizar ela de qualquer lugar.
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
