import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private final int[][] dados;

    public Matriz(int linhas, int colunas) {
        if (linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException("Dimensões devem ser positivas");
        }
        dados = new int[linhas][colunas];
        inicializar(-1);
    }

    // Preenche toda a matriz com o valor informado
    public void inicializar(int valor) {
        for (int[] linha : dados) {
            for (int j = 0; j < linha.length; j++) {
                linha[j] = valor;
            }
        }
    }

    // Lê valores do usuário
    public void preencherManual(Scanner scanner) {
        scanner.useDelimiter("[,\\s]+");
        System.out.printf("Digite %d valores (3 por linha ou todos de uma vez):%n",
                dados.length * dados[0].length);
        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados[i].length; j++) {
                while (!scanner.hasNextInt()) {
                    System.out.print("Valor inválido. Tente novamente: ");
                    scanner.next();
                }
                dados[i][j] = scanner.nextInt();
            }
        }
    }

    // Preenche com números aleatórios no intervalo [minimo, maximo]
    public void preencherAutomatico(int minimo, int maximo, Random random) {
        if (minimo > maximo) {
            throw new IllegalArgumentException("Valor mínimo maior que o máximo");
        }
        for (int[] linha : dados) {
            for (int j = 0; j < linha.length; j++) {
                linha[j] = random.nextInt(maximo - minimo + 1) + minimo;
            }
        }
    }

    // Substitui o valor da posição pelo marcador
    public void removerElemento(int linha, int coluna, int marcador) {
        validarPosicao(linha, coluna);
        dados[linha - 1][coluna - 1] = marcador;
    }

    private void validarPosicao(int linha, int coluna) {
        if (linha < 1 || linha > dados.length || coluna < 1 || coluna > dados[linha - 1].length) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    }

    // Exibe a matriz em formato tabular
    public void exibir() {
        for (int[] linha : dados) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}