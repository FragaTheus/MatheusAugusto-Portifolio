
import java.util.Scanner;

public class Vetores {
    //Atributos
    public int[] vetorA;
    public int[] vetorB;
    //Construtor
    public Vetores(int tamanhoA, int tamanhoB) {
        this.vetorA = new int[tamanhoA];
        this.vetorB = new int[tamanhoB];
    }
    //Metodos
    public void pegaNumeros(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor para a posicao "+i+" do vetor");
            vetorA[i] = sc.nextInt();
        }
    }
    
     public  void inverteVetores(int[] vetorA, int[] vetorB) {
        for(int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }
    }
    
}
