import java.util.Scanner;
public class aula02 {

    public static Scanner input = new Scanner(System.in);
    public static final int ANO_ATUAL = 2026; 
    //quando se coloca a palavra final você determina que é uma constante.

    public static void main(String[]args){

        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        if (idade >= 18) {

            System.out.println("Você ja pode tirar a carteira de motorista!");

        } else{

            System.out.println("Você ainda não pode tirar carteira de motorista!");
        }
        if idade < 16) {

            System.out.println("Você não pode votar!");

        } else if (idade < 18) {
            
            System.out.println("Você pode tirar o titulo de eleitor e votar! ");


        } else if (idade < 70) {

            System.out.println("É obrigatório ter titulo de eleitor e votar!");

        } else {

            System.out.println("Você não tem mais obrigação de votar!");

        }

        int anoNasc = ANO_ATUAL - idade;
        System.out.println("Você nasceu provavelmente em " + anoNasc);

    }
}
//HARD CODED VALUE - MAGICAL VALUE