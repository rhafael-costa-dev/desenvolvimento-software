package br.edu.up.gerenciador;

import java.io.*;
import java.util.Scanner;

public class Principal {

    /*
     * Cria duas constantes que vão ser utilziadas
     * para criação do diretorio e arquivo
     * MODIFICAR para o endereço do sue PC
     */
    static final String DEFAULT_PATH = "C:\\Users\\autologon\\Documents\\Projetos\\Aula06";
    static final String DEFAULT_FILE_NAME = "dados-alunos.txt";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String resposta = "Sim";
        do {
            // Menu de opções do sistema
            // MODIFICAR PARA FICAR MAIS ELEGANTE
            System.out.println("Digite 1 para cadastrar e 2 para ler");
            var op = scanner.nextLine();

            switch (op) {
                case "1":
                    iniciarCadastroAluno(scanner);
                    break;
                case "2":
                    iniciarLeitura();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

            System.out.println("Deseja continuar");
            resposta = scanner.nextLine();
        } while (resposta.equals("Sim"));
    }

    /**
     * Faz a chamada para a classe resposanvel por ler os dados do arquivo
     * @throws IOException
     */
    public static void  iniciarLeitura() throws IOException {
        // cria o arquivo de acordo com as constantes
        File arquivo = new File(DEFAULT_PATH, DEFAULT_FILE_NAME);
        Reader reader =  new Reader();
        // chama o metodo de leitura de arquivo
        reader.iniciarLeitura(arquivo);
    }

    public static void iniciarCadastroAluno(Scanner scanner) throws IOException {
        String resposta = "Sim";
        // inicia a captura dos dados do aluno vai console
        // MODIFICAR OS MENU PARA FICAR MAIS ELEGANTE
        do {
            System.out.println("Informe o nome do Aluno");
            var nome =  scanner.nextLine();

            System.out.println("Informe a matricula do Aluno");
            var matricula = Long.parseLong(scanner.nextLine());

            // cria um objeto Aluno
            Aluno aluno = new Aluno(matricula, nome);
            // chama o metodo salva aluno
            salvarDados(aluno);

            System.out.println("Deseja continuar");
            resposta = scanner.nextLine();

        } while(resposta.equals("Sim"));
    }

    /**
     * Faz a chamada para a classe resposanvel por salvar os dados do aluno
     * @param aluno
     * @throws IOException
     */
    public static void salvarDados(Aluno aluno) throws IOException {
        Writer writer = new Writer();
        File diretorio = writer.criarDiretorio(DEFAULT_PATH);
        File arquivo = writer.criarArquivo(diretorio, DEFAULT_FILE_NAME);

        writer.gravarDados(arquivo, aluno);
    }
}
