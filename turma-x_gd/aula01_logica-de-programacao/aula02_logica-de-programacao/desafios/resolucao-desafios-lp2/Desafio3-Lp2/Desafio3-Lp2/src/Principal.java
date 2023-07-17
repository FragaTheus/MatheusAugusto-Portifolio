
import java.util.Scanner;

public class Principal {
    
    public static double calculaEnergia(double pesoEmKg){
        final double VELOCIDADEDALUZ = 300000;
        double massa = pesoEmKg/1000;
        return massa * (VELOCIDADEDALUZ * VELOCIDADEDALUZ);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso de um objeto em kg: ");
        double peso = sc.nextDouble();
        
        double energia = calculaEnergia(peso);
        System.out.println("A energia contida no objeto no qual voce informou e de "+energia+" J");
    }
    
}