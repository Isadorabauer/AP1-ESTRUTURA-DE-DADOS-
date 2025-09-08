import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz(3, 3);

        matriz.preencherAutomatico(0, 9, new Random());
        System.out.println("Matriz preenchida automaticamente:");
        matriz.exibir();

        System.out.println("Removendo elemento na posição (2,2):");
        matriz.removerElemento(2, 2, 0);
        matriz.exibir();

        System.out.println("Informe novos valores para preencher manualmente:");
        matriz.preencherManual(scanner);
        System.out.println("Matriz após preenchimento manual:");
        matriz.exibir();
    }
}