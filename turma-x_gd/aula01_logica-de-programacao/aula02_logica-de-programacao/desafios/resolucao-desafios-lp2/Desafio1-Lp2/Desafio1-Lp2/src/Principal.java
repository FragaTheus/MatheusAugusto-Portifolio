
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Numeros nm = new Numeros();
        int[] vetor = new int[15];
        
        for (int i = 0; i < vetor.length; i++) {
            //Tentei usar o scaner, mas como ele nao continuava o looping tive que criar a variavel "numero"
            int numero = parseInt(JOptionPane.showInputDialog(null, "Digite o numero de posicao"+(i+1)));
            vetor[i] = numero;
        }
        for (int i = 0; i < vetor.length; i++) {
            if(nm.isPar(vetor[i])){
                nm.quantidadePar++;
            }else{
                nm.quantidadeImpar++;
            }
        }
        JOptionPane.showMessageDialog(null, "Nesse vetor temos "+nm.quantidadePar+" numeros pares e "
                                                            +nm.quantidadeImpar+" numeors impares");
    }
    
}
