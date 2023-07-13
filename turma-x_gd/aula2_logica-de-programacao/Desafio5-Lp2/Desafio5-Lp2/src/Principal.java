
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Vetores vt = new Vetores(10,10);
        vt.pegaNumeros();
        vt.inverteVetores(vt.vetorA, vt.vetorB);
        
        System.out.println("Os valores armazenados nos vetores sao os seguintes:\n");
        for (int i = 0; i < vt.vetorA.length; i++) {
            System.out.println("Posicao "+i+" do vetor A contem "+vt.vetorA[i]
                                +" e essa mesma posicao do vetor B contem "+vt.vetorB[i]);
        }
    }
    
}
