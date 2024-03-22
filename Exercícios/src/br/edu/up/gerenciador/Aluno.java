package br.edu.up.gerenciador;

public class Aluno {
    public Long matricula;
    public String nome;

    public Aluno(Long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void imprimirDados() {
        System.out.println();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " +  this.nome);
        System.out.println("==========================");
    }
}
