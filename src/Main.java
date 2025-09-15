import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Matriz matriz = new Matriz(3, 3);
//
//        matriz.preencherAutomatico(0, 9, new Random());
//        System.out.println("Matriz preenchida automaticamente:");
//        matriz.exibir();
//
//        System.out.println("Removendo elemento na posição (2,2):");
//        matriz.removerElemento(2, 2, 0);
//        matriz.exibir();
//
//        System.out.println("Informe novos valores para preencher manualmente:");
//        matriz.preencherManual(scanner);
//        System.out.println("Matriz após preenchimento manual:");
//        matriz.exibir();


        int[][] matriz = {
                {9, 2, 6},
                {11, 2, 15},
                {14, 7, 10}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("\nOrdenada por linha:");
        int[][] linhasOrdenadas = MatrizOrdenacao.ordenarLinhas(matriz);
        imprimirMatriz(linhasOrdenadas);

        System.out.println("\nOrdenada como vetor:");
        int[][] comoVetor = MatrizOrdenacao.ordenarComoVetor(matriz);
        imprimirMatriz(comoVetor);

        System.out.println("\nOrdenada por coluna:");
        int[][] colunasOrdenadas = MatrizOrdenacao.ordenarColunas(matriz);
        imprimirMatriz(colunasOrdenadas);
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }
}