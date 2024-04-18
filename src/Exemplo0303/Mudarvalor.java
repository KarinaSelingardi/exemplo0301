package Exemplo0303;



public class Mudarvalor {

    private int Soma;

    public int getSoma() {
        return Soma;
    }

    // Setter para o atributo Soma
    public void setSoma(int novaSoma) {
        this.Soma = novaSoma;
    }

 /*   public static void main(String[] args) {
        Mudarvalor objeto = new Mudarvalor();
        objeto.setSoma(5); // Define o valor inicial de Soma como 5

        // Captura do terceiro número fornecido pelo usuário
        String auxl = JOptionPane.showInputDialog(null, "Forneça o valor do terceiro número");
        if (auxl == null)
            System.exit(0);

        try {
            int num3 = Integer.parseInt(auxl);

            // Realiza a soma do valor atual de Soma com o terceiro número e exibe o resultado
            JOptionPane.showMessageDialog(null, "Soma = " + (objeto.getSoma() + num3));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
    }

  */
}
