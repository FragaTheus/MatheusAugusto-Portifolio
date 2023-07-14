package br.com.desafiointroducaojava.desafio3;

import java.util.Scanner;

public class Desafio3 {

    public static double getPeDeMeia(double varTotalRenda){
        double valorPeDeMeia = 0.10;
        double resultPeDeMeia = varTotalRenda * valorPeDeMeia;
        return resultPeDeMeia;
    }

    public static void main(String[] args) {
        double totalRenda, totalGastos, peDeMeia, resto;
        Scanner inputData = new Scanner(System.in);

        System.out.println("Digite o valor do seu salario: ");
        totalRenda = Double.parseDouble(inputData.nextLine());

        System.out.println("Digite o valor dos seus gastos mensais: ");
        totalGastos = Double.parseDouble(inputData.nextLine());

        peDeMeia = getPeDeMeia(totalRenda);
        resto = totalRenda - totalGastos;

        if (resto > 0){
            System.out.println("Voce pagou todas as contas, e ainda sobrou "+resto+
                                ". Para o seu pé de meia, voce devera guardar R$"+peDeMeia+" por mes.");
        }else{
            System.out.println("Voce usou todo o seu dinheiro e nao sobrou nada. " +
                                "Para o seu pé de meia, voce devera guardar R$"+peDeMeia+" por mes.");
        }

    }

}
