package Exemplo0309;

public class Exemplo0309 {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Nenhum argumento fornecido");
            return;
        }

        int a;
        try {
            a = Integer.parseInt(args[0]);
            while (a >= 0) {
                System.out.println(" " + a);
                Thread.sleep(1000);
                a--;
            }
            System.out.println("Fim da primeira contagem");
            System.out.println();
            Thread.sleep(1000);
            a = 0; // Reinicia o valor de 'a' para 0
            do {
                System.out.println(" " + a);
                Thread.sleep(1000);
                a++;
            } while (a <= Integer.parseInt(args[0]));
            System.out.println("Fim da segunda contagem ");
        } catch (InterruptedException erro) {
            System.out.println("Algo interrompeu a contagem ");
        } catch (NumberFormatException erro) {
            System.out.println("Não foi fornecido um argumento válido");
        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Argumento ausente");
        }
    }
}

