package br.com.apkdoandroid.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    // adicione em um Scratch e rode o código
    public static void main(String[] args) {
        int valorMaximo = 1200; // Defina o valor máximo desejado
        double valorInicial = 4.00; // Define o valor inicial
        double precisao = 0.00001; // Define uma pequena margem de erro

        int quantidadeItens = (int) Math.ceil((valorMaximo - valorInicial) / 4.00 + precisao); // Calcula a quantidade de itens

        try {
            FileWriter arquivoWriter = new FileWriter("sdp.xml");
            PrintWriter printWriter = new PrintWriter(arquivoWriter);

            printWriter.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            printWriter.println("<resources>");

            for (int i = 1; i <= quantidadeItens; i++) {
                double valorDP = valorInicial + (i - 1) * 4.00; // Calcula o valor em dp
                if (valorDP > valorMaximo) {
                    valorDP = valorMaximo; // Ajusta para o valor máximo
                }
                System.out.println(String.format("    <dimen name=\"_%dsdp\">%.2fdp</dimen>", i, valorDP));
                printWriter.println(String.format("    <dimen name=\"_%dsdp\">%.2fdp</dimen>", i, valorDP));
            }

            printWriter.println("</resources>");

            printWriter.close();
            System.out.println("Arquivo sdp.xml gerado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
