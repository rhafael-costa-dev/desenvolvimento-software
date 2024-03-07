import java.util.Scanner;

/**
 * Resolução do exercicío 5 da aula de métodos
 */
public class Exercicio5 {

    /**
     * Método Principal da Classe
     * @param args
     */
    public static void main(String[] args) {
        lerNome();
        imprimirNome("Rhafael");
    }

    /**
     * Método responsável por ler o nome
     */
    public static void lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome = scanner.nextLine();

        // Chama o método imprimir nome
        imprimirNome(nome);
    }

    /**
     * Imprimir a variavel no console
     * @param nome
     */
    public static void imprimirNome(String nome) {
        System.out.println("Seja bem vindo: " + nome);
    }
}
