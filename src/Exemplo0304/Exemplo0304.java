package Exemplo0304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplo0304 {
    public static void main (String args[]) throws IOException
    {
        BufferedReader dado;
        System.out.println("Entre com o seu nome: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Seu nome é " + dado.readLine());
    }
}
