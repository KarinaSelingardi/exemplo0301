import javax.swing.*;

class Exemplo0301 {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null,"FORNEÇA UM VALOR NUMÉRICO ENTRE 0 E 10");

        if (aux != null) {
            try {
                float x = Float.parseFloat(aux);
                if (x >= 0 && x <= 10)
                    JOptionPane.showMessageDialog(null,"Nota = " + x + ", valor válido!");
                else
                    JOptionPane.showMessageDialog(null,"Nota = " + x + ", valor inválido!");
            }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos.");
            }
            System.exit(0);
        }
    }
}
