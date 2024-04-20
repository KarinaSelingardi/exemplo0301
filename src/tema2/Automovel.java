package tema2;

abstract class Automovel{//superclasse
    abstract String buzinar();
    public String nome(String nome){
        return nome;
    }
}

class Carro extends Automovel{


    @Override
    String buzinar() {
     return "Faz o barulho: Beep Beep";

    }

    @Override//sobrescrevendo um método da superclasse
    public String nome(String nome) {
        return "O carro é " + nome;


    }
}

class Executa {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.nome("Corsa"));
        System.out.println(carro.buzinar());
    }
}


