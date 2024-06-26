
package Exemplo0303;
import javax.swing.*;
public class Exemplo0303 {

    public static void main (String args[])
    {
        Mudarvalor mv = new Mudarvalor();

        Thread tempo;// cria objeto (tempo) para controle de tempo

        String auxl = JOptionPane.showInputDialog(null, "foneça o valor do primero número");
        if (auxl == null)
            System.exit(0);
        String aux2 = JOptionPane.showInputDialog(null,"forneça o valor do segundo número");
        if (aux2 == null)
            System.exit(0);
        try {
            int num1 = Integer.parseInt(auxl);
            int num2 = Integer.parseInt(aux2);

            mv.setSoma(num1 + num2);

            System.out.println( "mv.Soma=" + mv.getSoma() );

            JOptionPane.showMessageDialog(null, "Soma =" + (num1 + num2));
            JOptionPane.showMessageDialog(null, " Subtração= " + (num1 - num2));
            JOptionPane.showMessageDialog(null, " multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, " Divisão = " + (num1 / num2));
        } catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,"Erro na divisão por zero!", "Erro",JOptionPane.ERROR_MESSAGE);
System.out.println(erro.getMessage());
erro.printStackTrace();
        }
        catch (NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null,"Digite apenas números inteiros","Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
    finally
        {
            JOptionPane.showMessageDialog(null,"Final da execução!");
        }
        System.exit(0);
    }
}
