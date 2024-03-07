import java.util.Scanner;
/**
 * Resolução do exercicío 3 da aula de vetores e repetidores
 */
public class Exercicio3 {
    
    /**
     * Método principal da classe 
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação da matrix de alunos contendo 5 linhas e 4 colunas
        String[][] alunos = new String[5][4];

        // Laço de repetição para armazenar os valores dos alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite a Matricula: ");
            alunos[i][0] = scanner.nextLine();

            System.out.println("Digite o Nome: ");
            alunos[i][1] = scanner.nextLine();

            System.out.println("Digite a Nota 1: ");
            alunos[i][2] = scanner.nextLine();

            System.out.println("Digite a Nota 2: ");
            alunos[i][3] = scanner.nextLine();
        }

        // Laço de repetição para calular e exibir os dados dos alunos
        for (int i = 0; i < alunos.length; i++) {

            // Calculo da nota final do aluno na posição de i
            var notaFinal = (Double.parseDouble(alunos[i][2]) + 
                            Double.parseDouble(alunos[i][3]) ) / 2;

            // if implicito para verificar se o aluno está aprovado
            var status = notaFinal < 6 ? 
                    "Aprovado: Sim ( ) Não ( X )"
                :
                    "Aprovado: Sim ( x ) Não ( )" ;
            
            System.out.println("======================");
            System.out.println();
            System.out.println("Matricula: " + alunos[i][0]);
            System.out.println("Nome: " + alunos[i][1]);
            System.out.println(status);
            System.out.println("Nota Final: " + notaFinal);           
        }
    }
}
