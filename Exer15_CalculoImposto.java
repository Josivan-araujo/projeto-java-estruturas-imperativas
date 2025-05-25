package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer15_CalculoImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        double valorIR = salarioBruto * 0.05;
        double valorINSS = salarioBruto * 0.11;
        double descontos = valorIR + valorINSS;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Valor do IR: R$ %.2f\n", valorIR);
        System.out.printf("Valor do INSS: R$ %.2f\n", valorINSS);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);


        sc.close();

    }
}