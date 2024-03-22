package br.edu.up.gerenciador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    /**
     * Cria o diretorio caso não exista
     * @param path
     * @return
     */
    public File criarDiretorio(String path) {
        File diretorio =  new File(path);
        if (!diretorio.exists())
            diretorio.mkdir();

        return diretorio;
    }

    /**
     * Cria o arquivo caso não exista
     * @param diretorio
     * @param fileName
     * @return
     * @throws IOException
     */
    public File criarArquivo(File diretorio, String fileName) throws IOException {
        File file =  new File(diretorio, fileName);
        if (!file.exists())
            file.createNewFile();

        return file;
    }

    /**
     * Escreve os dados do aluno no arquivo
     * @param file
     * @param aluno
     * @throws IOException
     */
    public void gravarDados(File file, Aluno aluno) throws IOException {

        FileWriter fileWriter =  new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.print(aluno.matricula);
        printWriter.print(";");
        printWriter.print(aluno.nome);
        printWriter.print("\n");
        printWriter.flush();
        printWriter.close();
    }
}
