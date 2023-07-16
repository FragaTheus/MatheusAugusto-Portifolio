package br.com.desafiointroducaojava.desafio1;

import java.util.Scanner;

public class Desafio1 {

    public static double getMedia(double[] arrayNota){
        double resultMedia;
        double totalNota = 0;
        for (int i = 0; i < arrayNota.length; i++){
            double arrayElement = arrayNota[i];
            totalNota += arrayElement;
        }
        resultMedia = totalNota/arrayNota.length;
        return resultMedia;
    }

    public static void main(String[] args) {
        final int ARRAYINDEXCONTROL = 4;
        double[] nota = new double[ARRAYINDEXCONTROL];
        double media;
        Scanner inputNota = new Scanner(System.in);

        for(int i = 0; i < nota.length; i++){
            System.out.println("Digite a nota "+ (i + 1) +" para o calulo");
            nota[i] = inputNota.nextDouble();
        }
        media = getMedia(nota);
        System.out.print("A sua media é de " + media);
    }

}