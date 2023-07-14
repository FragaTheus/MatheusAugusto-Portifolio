package br.com.desafiointroducaojava.desafio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio2 {
    public double peso, altura, imc;
    Scanner inputData = new Scanner(System.in);
    DecimalFormat formatImc = new DecimalFormat("0.00");

    public double calculaImc(double varPeso, double varAltura){
        return varPeso/(varAltura*varAltura);
    }

    public String getNivelImc(double varImc){
        if (varImc <= 18.5){
            return "Seu imc é de: "+formatImc.format(varImc)+" voce está abaixo do peso";
        }
        if (varImc <= 24.5){
            return "Seu imc é de: "+formatImc.format(varImc)+" voce está no peso ideal";
        }
        if (varImc <= 29.9){
            return "Seu imc é de: "+formatImc.format(varImc)+" voce está acima do peso";
        }
        if (varImc <= 34.9){
            return "Seu imc é de: "+formatImc.format(varImc)+" voce está na obesidade grau 1";
        }
        if (varImc <= 39.9){
            return "Seu imc é de: "+formatImc.format(varImc)+" voce está na obesidade grau 2";
        }
        else{
            return "Seu imc é de: "+formatImc.format(varImc)+" voce está na obesidade grau 3";
        }
    }
    public static void main(String[] args) {
        Desafio2 objDesafio2 = new Desafio2();

        System.out.println("Digite seu peso: ");
        objDesafio2.peso = Double.parseDouble(objDesafio2.inputData.nextLine());

        System.out.println("Digite sua altura: ");
        objDesafio2.altura = Double.parseDouble(objDesafio2.inputData.nextLine());

        objDesafio2.imc = objDesafio2.calculaImc(objDesafio2.peso, objDesafio2.altura);

        System.out.println(objDesafio2.getNivelImc(objDesafio2.imc));
    }
}
