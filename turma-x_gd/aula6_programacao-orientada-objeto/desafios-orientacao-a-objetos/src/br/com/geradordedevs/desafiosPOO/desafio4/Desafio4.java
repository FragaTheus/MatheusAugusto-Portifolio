package br.com.geradordedevs.desafiosPOO.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

    public static boolean isEven(int variableNumber){
        boolean even = false;
        if (variableNumber %2 == 0){
            even = true;
        }
        return even;
    }

    public static List<Integer> evenFilter(int[][] matrizNumbers){
        boolean even;
        List<Integer> evenAndBiggerThanTen = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Integer matrizIndex = matrizNumbers[i][j];
                even = isEven(matrizIndex);
                if (even && matrizIndex > 10){
                    evenAndBiggerThanTen.add(matrizIndex);
                }
            }
        }
        return evenAndBiggerThanTen;
    }

    public static List<Integer> oddFilter(int[][] matrizNumbers){
        boolean even;
        List<Integer> oddAndBiggerThanTwenty = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Integer matrizIndex = matrizNumbers[i][j];
                even = isEven(matrizIndex);
                if (!even && matrizIndex > 20){
                    oddAndBiggerThanTwenty.add(matrizIndex);
                }
            }
        }
        return oddAndBiggerThanTwenty;
    }

    public static void main(String[] args) {
        int setNumber;
        List<Integer> getEvenBiggerTen, getOddBiggerTwenty;
        int[][] numbers = new int[3][3];
        Scanner inputNumber = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um numero para posicao "+(i+1)+","+(j+1)+" da matriz");
                setNumber = inputNumber.nextInt();
                numbers[i][j] = setNumber;
            }
        }

        getEvenBiggerTen = evenFilter(numbers);
        getOddBiggerTwenty = oddFilter(numbers);

        System.out.println("Aqui estao os numeros pares e maiores que 10 da matriz: "+getEvenBiggerTen);
        System.out.println("E aqui estao os impares e maiores que 20: "+getOddBiggerTwenty);

    }

}
