package exercicios;

import javax.swing.JOptionPane;

public class AumentoProduto {
    public static void main(String[] args) {
        try {
            // Recebendo o valor do produto e o código de aumento
            double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
            int codigoAumento = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de aumento:"));

            // Calculando o novo valor do produto com base no código de aumento
            double novoValor = calcularNovoValor(valorProduto, codigoAumento);

            // Exibindo o novo valor do produto
            JOptionPane.showMessageDialog(null, "Novo valor do produto: R$" + novoValor);
        } catch (NumberFormatException e) {
            // Captura de erros se o usuário inserir valores inválidos
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para o produto e o código de aumento.");
        }
    }

    public static double calcularNovoValor(double valorProduto, int codigoAumento) {
        // Definindo a porcentagem de aumento com base no código fornecido
        double porcentagemAumento;
        switch (codigoAumento) {
            case 1:
                porcentagemAumento = 5.0;
                break;
            case 2:
                porcentagemAumento = 10.0;
                break;
            case 3:
                porcentagemAumento = 15.0;
                break;
            default:
                // Se o código de aumento não for válido, lança uma exceção
                throw new IllegalArgumentException("Código de aumento inválido.");
        }

        // Calculando o novo valor do produto com base na porcentagem de aumento
        double aumento = valorProduto * (porcentagemAumento / 100);
        return valorProduto + aumento;
    }
}


