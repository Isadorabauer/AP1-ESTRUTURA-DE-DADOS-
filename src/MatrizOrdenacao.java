import java.util.Arrays;

public class MatrizOrdenacao {

    private static int interacoesMerge;
    private static int trocasMerge;


    public static int[][] ordenarLinhas(int[][] matriz) {
        int[][] copia = copiarMatriz(matriz);
        for (int[] linha : copia) {
            bubbleSort(linha);
        }
        return copia;
    }

    public static int[][] ordenarComoVetor(int[][] matriz) {
        int linhas = matriz.length;
        if (linhas == 0) {
            return new int[0][0];
        }

        int colunas = matriz[0].length;
        int[] valores = new int[linhas * colunas];
        int indice = 0;

        for (int[] linha : matriz) {
            for (int valor : linha) {
                valores[indice++] = valor;
            }
        }

        mergeSort(valores);

        int[][] resultado = new int[linhas][colunas];
        indice = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = valores[indice++];
            }
        }
        return resultado;
    }

    public static int[][] ordenarColunas(int[][] matriz) {
        int[][] copia = copiarMatriz(matriz);
        int linhas = copia.length;
        if (linhas == 0) {
            return copia;
        }

        int colunas = copia[0].length;
        for (int coluna = 0; coluna < colunas; coluna++) {
            int[] valoresColuna = new int[linhas];
            for (int linha = 0; linha < linhas; linha++) {
                valoresColuna[linha] = copia[linha][coluna];
            }

            bubbleSort(valoresColuna);

            for (int linha = 0; linha < linhas; linha++) {
                copia[linha][coluna] = valoresColuna[linha];
            }
        }
        return copia;
    }

    private static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    private static void mergeSort(int[] vetor) {

        mergeSort(vetor, 0, vetor.length - 1);
    }

    private static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        for (int i = 0; i < n1; i++) {
            esquerda[i] = vetor[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            direita[j] = vetor[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {

            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }

    private static int[][] copiarMatriz(int[][] matriz) {
        int[][] copia = new int[matriz.length][];
        for (int i = 0; i < matriz.length; i++) {
            copia[i] = Arrays.copyOf(matriz[i], matriz[i].length);
        }
        return copia;
    }

}
