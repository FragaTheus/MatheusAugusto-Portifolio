package br.com.desafiointroducaojava.desafio5;

import java.util.Scanner;

public class Desafio5 {

    public static double setValorConta(int varConsumo){
        double valorConta = 22.38;
        if (varConsumo >= 50){
            valorConta += 10.17;
        } else if (varConsumo >= 31) {
           valorConta += 9.64;
        } else if (varConsumo >= 21) {
            valorConta += 8.75;
        } else if (varConsumo >= 11) {
            valorConta += 3.50;
        }
        return valorConta;
    }

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int consumo;
        double totalConta;

        System.out.println("Digite a quantidade que o cliente utilizou de agua: ");
        consumo = Integer.parseInt(inputData.nextLine());

        totalConta = setValorConta(consumo);

        System.out.println("O consumo de agua do cliente foi de "+consumo+" metros cubicos, sua conta devera ficar no valor de: "+totalConta);
    }

}
