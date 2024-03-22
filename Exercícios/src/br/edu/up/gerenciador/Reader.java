package br.edu.up.gerenciador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    /**
     * Faz a leitura do arquivo de dados do aluno
     * @param arquivo
     * @throws IOException
     */
    public void iniciarLeitura(File arquivo) throws IOException {
        String line;
        FileReader reader = new FileReader(arquivo);
        BufferedReader buffered = new BufferedReader(reader);

        while ((line = buffered.readLine()) != null) {
            String[] dados = line.split(";");

            // Faz o parse do array para variaveis
            var nome = dados[1];
            var matricula = Long.parseLong(dados[0]);

            // Cria um aluno
            Aluno aluno = new Aluno(matricula, nome);
            // chama o metodo imprimir dados da classe aluno
            aluno.imprimirDados();
        }
        // fecha as conexões com o arquivo
        buffered.close();
        reader.close();
    }

}
