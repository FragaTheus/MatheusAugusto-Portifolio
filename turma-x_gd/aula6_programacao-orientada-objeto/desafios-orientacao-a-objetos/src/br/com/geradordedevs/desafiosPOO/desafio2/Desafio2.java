package br.com.geradordedevs.desafiosPOO.desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Scanner inputName = new Scanner(System.in);
        String userName, searchName;
        boolean foundName = false;

        nameList.add("Matheus".toLowerCase());
        nameList.add("Jorge".toLowerCase());
        nameList.add("Renato".toLowerCase());
        nameList.add("Thais".toLowerCase());
        nameList.add("Pedro".toLowerCase());
        nameList.add("Wellington".toLowerCase());
        nameList.add("Leandro".toLowerCase());

        System.out.println("Digite um nome para colocarmos na lista de nome: ");
        userName = inputName.nextLine().toLowerCase();
        nameList.add(userName);

        System.out.println("Agora digite um nome para procurarmos na lista de nome: ");
        searchName = inputName.nextLine().toLowerCase();

        for (String name : nameList) {
            if (name.equals(searchName)){
                foundName = true;
            }
        }
        if (foundName){
            System.out.println("Achei! O nome "+searchName+" foi encontrado na lista");
        }else{
            System.out.println("Nao achei! O nome "+searchName+" nao foi encontrado na lista");
        }

    }

}
