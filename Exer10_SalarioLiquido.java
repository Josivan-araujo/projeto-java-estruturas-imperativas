package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer10_SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário base do funcionário: ");
        double salarioBase = sc.nextDouble();

        System.out.println("Informe as vantagens: ");
        double vantagens = sc.nextDouble();

        System.out.println("Informe os descontos: ");
        double descontos = sc.nextDouble();

        sc.close();

        double salarioLiquido = salarioBase + vantagens - descontos;

        System.out.printf("O salário Líquido é: R$ %.2f\n", salarioLiquido);

    }
}