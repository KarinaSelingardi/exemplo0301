import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao programa de aprendizado de Java!");
        System.out.println("Você gostaria de aprender sobre tratamento de exceções?");
        System.out.println("Digite 'sim' para continuar ou qualquer outra coisa para sair.");
        
        String input = scanner.nextLine();
        
        if(input.equalsIgnoreCase("sim")) {
            System.out.println("Ótimo! Vamos aprender sobre tratamento de exceções.");
            try {
                simulateException();
            } catch (Exception e) {
                System.out.println("Ops! Algo deu errado ao aprender sobre tratamento de exceções.");
                System.out.println("Aqui está uma mensagem de erro para ajudar:");
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Que pena! Esperamos que você volte para aprender mais sobre Java em breve.");
        }
        
        scanner.close();
    }
    
    public static void simulateException() throws Exception {
        System.out.println("Aprenderemos sobre tratamento de exceções agora.");
        System.out.println("Vamos simular uma exceção...");
        throw new Exception("Erro ao aprender sobre tratamento de exceções.");
    }
}
