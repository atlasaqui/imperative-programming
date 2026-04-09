import java.util.Random;
import java.util.Scanner;

public class VetorMetodosDeUso {
    public static final int TAM = 10; // Reduzi para 10 para facilitar seu teste visual
    public static final int MIN = 1;
    public static final int MAX = 50; // Aumentei o MAX para o método "Sem Repetição" funcionar
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numeros = new int[TAM];
        
        System.out.println("--- Testando Preenchimento sem Repetição ---");
        preencherAleatorioOrdenadoSemRepeticao(numeros);
        imprimir(numeros);
        
        double media = calcularMedia(numeros);
        System.out.printf("\nA média do vetor é: %.2f\n", media);
        
        buscarNumeros(numeros);
    }

    // 1. Preenchimento Comum
    public static void preencherAleatorio(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
    }

    // 2. Preenchimento já Ordenado
    public static void preencherAleatorioOrdenado(int[] v) {
        for (int i = 0; i < v.length; i++) {
            inserirOrdenado(v, i, random.nextInt(MAX - MIN + 1) + MIN);
        }
    }

    // 3. Preenchimento Ordenado e SEM DUPLICADOS
    public static void preencherAleatorioOrdenadoSemRepeticao(int[] v) {
        int num;
        for (int i = 0; i < v.length; i++) {
            do {
                num = random.nextInt(MAX - MIN + 1) + MIN;
            } while (buscaSequencial(v, i, num) != -1); // Enquanto achar o número, sorteia de novo
            
            inserirOrdenado(v, i, num);
        }
    }

    // 4. Imprimir
    public static void imprimir(int[] v) {
        System.out.print("{");
        if (v.length >= 1) {
            System.out.print(" " + v[0]);
            for (int i = 1; i < v.length; i++) {
                System.out.print(", " + v[i]);
            }
        }
        System.out.println(" }");
    }

    // 5. Média
    public static double calcularMedia(int[] v) {
        int soma = 0;
        for (int valor : v) {
            soma += valor;
        }
        return (double) soma / v.length;
    }

    // 6. Busca Sequencial
    public static int buscaSequencial(int[] v, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (x == v[i]) return i;
        }
        return -1;
    }

    // 7. Busca Binária (Requer vetor ordenado)
    public static int buscaBinaria(int[] v, int n, int x) {
        int inicio = 0, fim = n - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (x == v[meio]) return meio;
            else if (x < v[meio]) fim = meio - 1;
            else inicio = meio + 1;
        }
        return -1;
    }

    // 8. Interação de Busca
    public static void buscarNumeros(int[] v) {
        int num;
        System.out.print("\nDigite um número para buscar: ");
        num = input.nextInt();
        while (num >= MIN && num <= MAX) {
            int pos = buscaBinaria(v, v.length, num);
            if (pos != -1) {
                System.out.printf("Número %d está na posição %d (índice %d)\n", num, pos + 1, pos);
            } else {
                System.out.printf("Número %d não está no vetor\n", num);
            }
            System.out.print("Digite outro número (ou fora do intervalo para sair): ");
            num = input.nextInt();
        }
    }

    // 9. Auxiliar de Inserção Mantendo Ordem
    public static void inserirOrdenado(int[] v, int n, int x) {
        int pos = n;
        while (pos >= 1 && x < v[pos - 1]) {
            v[pos] = v[pos - 1];
            pos--;
        }
        v[pos] = x;
    }

    // 10. Algoritmo Insertion Sort
    public static void insertionSort(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }

    // 11. Algoritmo Selection Sort
    public static void selectionSort(int[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }
    }
}
