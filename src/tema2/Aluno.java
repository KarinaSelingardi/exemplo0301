package tema2;

import java.util.ArrayList;
import java.util.List;

// Exemplo de agregação em que um aluno não é dependente do departamento
public class Aluno {
    String nome;
    int id;
    Aluno(String nome, int id){
        this.nome=nome;
        this.id=id;
    }
}

class Departamento{
    String nome;
    List<Aluno> alunos = new ArrayList<>();
    Departamento(String nome){
        this.nome=nome;
    }

    // Método para adicionar aluno à lista de alunos do departamento
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para remover aluno da lista de alunos do departamento
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public static void main(String[] args) {
        Departamento departamentoRH = new Departamento("RH");
        Departamento departamentoTI = new Departamento("TI");

        Aluno aluno1 = new Aluno("Maria", 1);
        Aluno aluno2 = new Aluno("João", 2);

        // Adicionando alunos ao departamento de RH
        departamentoRH.adicionarAluno(aluno1);
        departamentoRH.adicionarAluno(aluno2);

        for (Aluno aluno : departamentoRH.alunos) {
            System.out.println(aluno.nome + " is a student of " + departamentoRH.nome);
        }

        // Movendo aluno1 do departamento de RH para o departamento de TI
        departamentoRH.removerAluno(aluno1);
        departamentoTI.adicionarAluno(aluno1);

        // Exemplo de como acessar os alunos nos departamentos
        System.out.println("Alunos no departamento de RH após remoção:");
        for (Aluno aluno : departamentoRH.alunos) {
            System.out.println(aluno.nome);
        }

        System.out.println("Alunos no departamento de TI após remoção :");
        for (Aluno aluno : departamentoTI.alunos) {
            System.out.println(aluno.nome);
        }
    }
}




