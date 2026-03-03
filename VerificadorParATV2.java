import java.util.Scanner;

public class VerificadorParATV2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite um numero Inteiro: ");
        int n1 = input.nextInt();

        // Parte 2: Uso da função para verificar e imprimir a mensagem
        if (ehPar(n1)) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        
        input.close();
    }

    // Requisito: Função que recebe int e retorna boolean
    public static boolean ehPar(int n) {
        return n % 2 == 0; 
    }
}


