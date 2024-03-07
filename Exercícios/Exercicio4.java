import java.util.Scanner;

/**
 * Resolução do exercicío 4 da aula de vetores e repetidores
 */
public class Exercicio4 {
    
    /**
     * Método principal da classe 
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação do vetor de notas contendo 5 colunas
        Double[] notas = new Double[5];

        System.out.println("Digite a Matricula: ");
        var matricula = scanner.nextLine();

        System.out.println("Digite o Nome: ");
        var nome = scanner.nextLine();

        // Laço de repetição para armazenar e capturar as notas dos alunos
        for (int i = 0; i < notas.length; i++) {
            double nota;
            // Laço para validar a nota informada
            do {
                var idx = i + 1;
                System.out.println("Digite a Nota " + idx + ":");
                nota = scanner.nextDouble();
            // Verifica se a nota informada é menor do que 0 ou maior que 10
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        System.out.println("======================");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);

        // Laço de repetição para exibir as notas dos alunos
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i+1 + ": " + notas[i]);
        }

        scanner.close();
    }
}
