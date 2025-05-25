package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer11_ShowAoVivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // distanciaKm valorHora qtdShow valorShow frete

        System.out.println("Informe a distância pecorrida: ");
        double distanciaKm = sc.nextDouble();

        System.out.println("Informe o valor a cada hora de show: ");
        double valorHora = sc.nextDouble();

        System.out.println("Informe o tempo de duração do show: ");
        double qtdShow = sc.nextDouble();

        sc.close();
       
        double deslocamento = distanciaKm * 50.0;
        double frete = deslocamento * 0.35;
        double valorShow = valorHora * qtdShow + deslocamento;

        System.out.printf("O valor do Show é: R$ %.2f\n", valorShow);
        System.out.printf("O valor do frete é: R$ %.2f\n", frete);


    }
}