/**
 * Resolução do exercicío 7 da aula de métodos
 */
public class Exercicio7 {

    /**
     * Método Principal da Classe
     * @param args
     */
    public static void main(String[] args) {
        var resultado = somarValores(10, 52.3);
        imprimir(resultado);
    }

    /**
      * Método responsável por somar os valores
      * @param valor1
      * @param valor2
      * @return
      */
    public static double somarValores(double valor1, double valor2) {
        return valor1 + valor2;
    }

    /**
     * Método responsável por imprimir a variável no console
     * @param valor
     */
    public static void imprimir(double valor) {
        System.out.println("Valor retornado: " + valor);
    }
}
