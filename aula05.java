import java.util.Scanner;

public class aula05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        int somaIdades = 0;
        int qtdPessoas = 0;
        double media;

        for (int i = 1; i <= 5; i++) {

            while (true) {
                System.out.println("Digite a idade da pessoa " + i + " (0 para encerrar): ");
                idade = input.nextInt();

                if (idade < 0) {
                    System.out.println("Resposta inválida! Idade não pode ser negativa.");
                } else {
                    break;
                }
            }

            if (idade == 0) {
                break; 
            }

            somaIdades += idade;
            qtdPessoas++;
        }

        if (qtdPessoas == 0) {
            System.out.println("Nenhuma pessoa participou da pesquisa.");
        } else {
            media = (double) somaIdades / qtdPessoas;
            System.out.println(qtdPessoas + " pessoas participaram da pesquisa.");
            System.out.println("A idade média dos participantes foi de " + media + " anos.");
        }

        input.close();
    }
}