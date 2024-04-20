package tema2;

// Classes Perna e Braco
class Perna {}
class Braco{}

// Classe Pessoa
public class Pessoa {
    private Perna[] pernas;
    private Braco[] bracos;

    // Construtor da Pessoa que recebe instâncias de Perna e Braco
    Pessoa(Perna perna1, Perna perna2, Braco braco1, Braco braco2) {
        this.pernas = new Perna[]{perna1, perna2};
        this.bracos = new Braco[]{braco1, braco2};
    }

    public static void main(String[] args) {
        Perna pernaEsquerda = new Perna();
        Perna pernaDireita = new Perna();
        Braco bracoEsquerdo = new Braco();
        Braco bracoDireito = new Braco();

        // Criando uma pessoa com as pernas e braços
        Pessoa pessoa = new Pessoa(pernaEsquerda, pernaDireita, bracoEsquerdo, bracoDireito);
        System.out.println("Pessoa criada com sucesso");
    }
}

