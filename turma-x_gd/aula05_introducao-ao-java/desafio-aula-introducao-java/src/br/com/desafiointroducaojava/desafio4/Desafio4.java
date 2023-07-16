package br.com.desafiointroducaojava.desafio4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio4 {

    public static double setJuros(double varValorTotalProduto, int varParcelas){
        double jurosAm = 0.012;
        double juros;
        double totalCompraComJuros;
        juros = varValorTotalProduto * jurosAm * varParcelas;
        totalCompraComJuros = varValorTotalProduto + juros;
        return  totalCompraComJuros;
    }

    public static double setDesconto(double varValorTotalProduto){
        double desconto = varValorTotalProduto * 0.10;
        double totalCompraComDesconto = varValorTotalProduto - desconto;
        return totalCompraComDesconto;
    }

    public static String setMsg(String varNomeCliente,int varParcelas, double varValorParcela, double varValorTotalCompra){
        DecimalFormat toFixed = new DecimalFormat("0.00");
        String msg1, msg2, msg3, finalMsg;
        msg1 = "Bem vindo "+varNomeCliente+"!";
        msg2 = "\nVoce parcelou sua compra em: "+varParcelas+ ", no valor de "+toFixed.format(varValorParcela);
        msg3 = ",\n e o total do seu produto vai ser de: "+varValorTotalCompra;
        finalMsg = msg1+msg2+msg3;
        return finalMsg;
    }

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String nome;
        double valorTotalProduto, totalCompra;
        int parcelas;
        double valorParcela;


        System.out.println("Bem vindo! Digite seu nome: ");
        nome = inputData.nextLine();

        System.out.println("Digite o valor do produto comprado: ");
        valorTotalProduto = Double.parseDouble(inputData.nextLine());

        System.out.println("Digite a quantidade de parcelas em que deseja fazer, maximo 12x");
        parcelas = Integer.parseInt(inputData.nextLine());



        if (parcelas == 1){
            totalCompra = setDesconto(valorTotalProduto);
            valorParcela = totalCompra/parcelas;
            System.out.println(setMsg(nome,parcelas,valorParcela,totalCompra));
        }else if (parcelas <= 10){
            totalCompra = valorTotalProduto;
            valorParcela = totalCompra/parcelas;
            System.out.println(setMsg(nome,parcelas,valorParcela,totalCompra));
        }else{
            totalCompra = setJuros(valorTotalProduto,parcelas);
            valorParcela = totalCompra/parcelas;
            System.out.println(setMsg(nome,parcelas,valorParcela,totalCompra));
        }

    }

}
