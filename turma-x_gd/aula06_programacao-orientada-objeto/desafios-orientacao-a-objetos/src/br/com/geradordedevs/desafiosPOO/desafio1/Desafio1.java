package br.com.geradordedevs.desafiosPOO.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

    public static boolean isEven(int indexNumber){
        boolean par = false;
        if (indexNumber%2 == 0){
            par = true;
        }
        return par;
    }

    public static int getPar(List<Integer> numberList){
        int numEven = 0;
        for (int number: numberList) {
            boolean par = isEven(number);
            if (par){
                numEven = numEven + 1;
            }
        }
        return numEven;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner inputNumber = new Scanner(System.in);
        int numEven, oddNumCount;

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um numero para a posicao "+(i+1)+" da lista de 15 numeros: ");
             numbers.add(inputNumber.nextInt());
        }

        numEven = getPar(numbers);
        oddNumCount = 15 - numEven;

        System.out.println("Nessa lista temos "+numEven+" numeros pares e "+oddNumCount+" numeros impares");
    }

}
