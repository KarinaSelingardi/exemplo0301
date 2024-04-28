package tema3;

import java.util.Scanner;
import java.util.UUID;

public class Pessoa {
    // Atributos
    protected String nome, nacionalidade, naturalidade;

    private boolean validaCPF(String cpf) {
        // Lógica para validar CPF
        return false;
    }

    private String identificador;

    protected void atualizarID(String CPF) {
        if (validaCPF(CPF))
            this.identificador = CPF;
        else
            System.out.println("ERRO: CPF inválido!");
    }

    protected String recuperarID() {
        return this.identificador;
    }

    // Métodos
    public Pessoa(String nome, String nacionalidade, String naturalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }

    // Método para atualizar o nome
    protected void atualizarNome(String nome) {
        this.nome = nome;
    }

    // Método para recuperar o nome
    protected String recuperarNome() {
        return this.nome;
    }

    // Método para recuperar a naturalidade
    protected String recuperarNaturalidade() {
        return this.naturalidade;
    }

    public static class Aluno extends Pessoa {
        private String matricula;

        public Aluno(String nome, String nacionalidade, String naturalidade) {
            super(nome, nacionalidade, naturalidade);
            matricula = UUID.randomUUID().toString();
        }
    }

    public static void main(String[]args){

    Scanner sacanner = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    String nomeAluno = sacanner.nextLine();

    System.out.println("Digite  a nacionalidade do aluno:");
    String nacionalidadeAluno = sacanner.nextLine();

    System.out.println("Digite a naturalidade do aluno");
String naturalidadeAluno = sacanner.nextLine();
 // criando um obj Aluno com os dados inseridos pelo user
        Aluno aluno = new Aluno(nomeAluno, nacionalidadeAluno, naturalidadeAluno);

        // Exibindo informações do aluno
        System.out.println("Nome do aluno: " + aluno.recuperarNome());
        System.out.println("Nacionalidade do aluno: " + aluno.nacionalidade);
        System.out.println("Naturalidade do aluno: " + aluno.recuperarNaturalidade());
        System.out.println("Matrícula do aluno: " + aluno.matricula);

        sacanner.close();
    }
}