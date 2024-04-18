public class whiledo {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Por favor, forneça um argumento.");
            return;
        }

        Thread tempo;
        tempo = Thread.currentThread();

        int a;
        try {
            a = Integer.parseInt(args[0]);
            while (a >= 0) {
                System.out.println(" " + a);
                tempo.sleep(1000);
                a--;
            }
            System.out.println("Fim da primeira contagem");
            System.out.println();// pula uma linha
            tempo.sleep(1000);
            do {
                System.out.println("Fim da segunda contagem");
                tempo.sleep(1000); // Adicionando tempo de espera
            } while (false); // Corrigindo a condição do loop
        } catch (InterruptedException erro) {
            System.out.println("Algo interrompeu a contagem");
        } catch (NumberFormatException erro) {
            System.out.println("Não foi fornecido um número inteiro válido"); // se o argumento for inválido
        }
    }
}
