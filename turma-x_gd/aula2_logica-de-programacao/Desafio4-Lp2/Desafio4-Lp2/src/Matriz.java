
import java.util.Scanner;

public class Matriz {
    private int[][] matriz;

    public Matriz(int linha, int coluna) {
        this.matriz = new int[linha][coluna];
    }
    
     public void lerNumeros() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor para a posicao "+i+" de linhas e outro para posicao "+j+" de colunas\n");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
     public int[] numerosMaioresQue10Pares() {
        int[] numeros = new int[9];
        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 10 && matriz[i][j] % 2 == 0) {
                    numeros[index] = matriz[i][j];
                    index++;
                }
            }
        }

        return numeros;
    }
     
     public int[] numerosMaioresQue20Impares() {
        int[] numeros = new int[9];
        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 20 && matriz[i][j] % 2 != 0) {
                    numeros[index] = matriz[i][j];
                    index++;
                }
            }
        }

        return numeros;
    }
    
}
