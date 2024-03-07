import java.util.Scanner;

/**
 * Resolução do exercicío 6 da aula de métodos
 */
public class Exercicio6 {

    /**
     * Método Principal da Classe
     * @param args
     */
    public static void main(String[] args) {
        var resultado = lerNumero();
        imprimir(resultado);
    }

    /**
     * Método responsável por ler o número
     */
    public static double lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var nome = scanner.nextDouble();
        
        scanner.close();

        // Chama o método multiplicar número
        double resultado = multiplicar(nome);

        // retorna o valor da multiplicação
        return resultado;
    }

    /**
     * Método responsável por mutiplicar o valor por 10
     * @param valor
     * @return
     */
    private static double multiplicar(double valor) {
        return valor * 10;
    }

    /**
     * Imprimir a variavel no console
     * @param nome
     */
    public static void imprimir(double nome) {
        System.out.println("Valor retornado: " + nome);
    }
}
