
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String[] nome = new String[7];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite um nome para a posicao "+(i+1));
            nome[i] = sc.nextLine().toLowerCase();
        }
        System.out.println("Agora digite um nome para a pesquisa: ");
        String pesquisa = sc.nextLine().toLowerCase();
        
        boolean achou = false;
        for (int i = 0; i < nome.length; i++) {
            if(nome[i].equals(pesquisa)){
                achou = true;
            }
        }
        if (achou) {
            System.out.println("Achei");
        }else{
            System.out.println("Nao achei");
        }
    }
    
}
