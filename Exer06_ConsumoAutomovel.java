package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer06_ConsumoAutomovel {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite a distância pecorrida: ");
        double distanciaPecorrida = sc.nextDouble();

        System.out.println("Digite o combustível gasto: ");
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distanciaPecorrida / combustivelGasto;

        System.out.println("Modelo do carro: " + modelo);
        System.out.printf("Consumo Médio do carro é: %.3f", consumoMedio);
        
        
    }
}