public class Principal {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(3,3);
        matriz.lerNumeros();

        System.out.println("Numeros maiores que 10 e pares:");
        for (int numero : matriz.numerosMaioresQue10Pares()) {
            if (numero != 0) {
                System.out.print(numero + " ");
            }
        }

        System.out.println("\nNumeros maiores que 20 e impares:");
        for (int numero : matriz.numerosMaioresQue20Impares()) {
            if (numero != 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
    

