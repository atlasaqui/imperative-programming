import java.util.Scanner;
public class ConversosTemperaturaATV3 {

    public static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {

        // Parte 1: Solicitar temperatura ao usuário
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        // Parte 2: Chamar a função
        double fahrenheit = celsiusParaFahrenheit(celsius);

        // Parte 3: Mostrar resultado formatado
        System.out.printf("%.1f°C equivale a %.1f°F%n", celsius, fahrenheit);

        input.close();
    }

    // Requisito: Função que recebe double e retorna o valor convertido
    public static double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
