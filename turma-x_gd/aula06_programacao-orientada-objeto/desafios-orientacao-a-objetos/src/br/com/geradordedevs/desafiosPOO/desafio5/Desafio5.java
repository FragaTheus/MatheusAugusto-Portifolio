package br.com.geradordedevs.desafiosPOO.desafio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        Scanner inputNumber = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor para a posiao "+(i+1)+" da lista.");
            listA.add(inputNumber.nextInt());
        }

        for (int i = listA.size() - 1; i >= 0; i--) {
            listB.add(listA.get(i));
        }

        System.out.println("Aqui estao os numeros digitados, mas agora de tras para frente: "+listB);

    }

}
