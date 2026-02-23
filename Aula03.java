import java.util.Scanner;

public class Aula03 {
    // O Scanner aqui fora é como um "porteiro" que todos os métodos da classe podem usar.
    public static Scanner input = new Scanner(System.in); 

    public static void main(String[] args){

        // PASSO 1: Coleta de dados
        System.out.println("Informe o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Informe o terceiro número: ");
        int num3 = input.nextInt();

        // Criei 3 "caixas" vazias para guardar o pódio (Ouro, Prata e Bronze)
        int maior, meio, menor;

        /* PASSO 2: O Grande Torneio (A Lógica do IF/ELSE)
           Imagine que cada IF é uma pergunta eliminatória.
        */

        // : O num1 é o campeão (maior ou igual a todos)?
        if (num1 >= num2 && num1 >= num3) {
            maior = num1; // Se sim, num1 ganha a medalha de OURO.

            // Agora, precisamos decidir quem fica com a Prata entre os que sobraram (2 e 3)
            if (num2 >= num3) {
                meio = num2;  // num2 é PRATA
                menor = num3; // num3 é BRONZE
            } else {
                meio = num3;  // num3 é PRATA
                menor = num2; // num2 é BRONZE
            }

        } 
        // Já que o num1 não foi o maior, o num2 é o campeão absoluto?
        else if (num2 >= num1 && num2 >= num3) {
            maior = num2; // Se sim, num2 ganha a medalha de OURO.

            // Agora decidimos a Prata e o Bronze entre os que sobraram (1 e 3)
            if (num1 >= num3) {
                meio = num1;  // num1 é PRATA
                menor = num3; // num3 é BRONZE
            } else {
                meio = num3;  // num3 é PRATA
                menor = num1; // num1 é BRONZE
            }
        } 
        // Se ninguém acima ganhou, sobrou para o num3 ser o campeão!
        else {
            maior = num3; // num3 ganha a medalha de OURO.

            // Agora decidimos a Prata e o Bronze entre os que sobraram (1 e 2)
            if (num1 >= num2) {
                meio = num1;  // num1 é PRATA
                menor = num2; // num2 é BRONZE
            } else {
                meio = num2;  // num2 é PRATA
                menor = num1; // num1 é BRONZE
            }
        }

        System.out.println(maior + " >= " + meio + " >= " + menor);
        
        input.close();
    }
}