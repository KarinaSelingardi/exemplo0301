package Exemplo0308;

public class Exemplo0308 {
    public static void main(String args[]) {
        Thread tempo;// cria objeto (tempo) para controle de tempo
        tempo = new Thread();
        tempo.start();
        int a, b;
        for (a = 0; a <= 10; a++) {
            System.out.print(a + "\n ");
        }
        System.out.println();
        for (a = 50; a >= 0; a = a - 5) {
            System.out.print(a + "\n ");
        }
        for(a=0;a<=30;a++){
            System.out.print(a + "\n ");

        }
        System.out.println();
        int h, m, s;
        System.out.println("Para encerrar o relógio pressione CTRL + C");
        try {
            while (true) {
                for (h = 0; h < 24; h++) {
                    for (m = 0; m < 60; m++) {
                        for (s = 0; s < 60; s++) {
                            System.out.println(h + "h: " + m + "min: " + s + "seg: ");
                            tempo.sleep(1000);
                            if (s == 10) {
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        } catch (InterruptedException erro) {
            erro.printStackTrace();
        }
    }
}
