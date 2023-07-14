package br.com.geradordedevs.desafiosPOO.desafio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio3 {

    public static double setEnergy(double variableMass){
        double energy;
        double speedOfLight = 300000;
        energy = variableMass * Math.pow(speedOfLight, 2);
        return energy;
    }

    public static void main(String[] args) {
        double mass;
        double energy;
        double getValue;
        Scanner inputMass = new Scanner(System.in);

        System.out.println("Digite a massa de um objeto (em kg) para que "
                          +"possamos calcular a quantidade de energia dele");
        mass = Double.parseDouble(inputMass.nextLine());

        getValue = setEnergy(mass);

        System.out.println("O valor da energia desse objeto é de: "+getValue+"J");

    }

}
